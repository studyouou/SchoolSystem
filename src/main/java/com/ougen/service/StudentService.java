package com.ougen.service;

import com.ougen.Enum.MyEnum;
import com.ougen.dao.StudentDao;
import com.ougen.dao.SubjectDao;
import com.ougen.dto.Result;
import com.ougen.entity.Student;
import com.ougen.entity.Subject;
import com.ougen.myexception.RepeatChooseSubjectException;
import com.ougen.myexception.SubjectNumIsOverException;
import com.ougen.myexception.UnkwonException;
import com.ougen.service.impl.StudentServiceImpl;
import com.ougen.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/2015:01
 */
@Service
public class StudentService implements StudentServiceImpl {
    @Autowired
    private StudentDao studentDao;

    @Autowired
    private SubjectDao subjectDao;

    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    public int updateStudentInfo(Student student) {
        return studentDao.updateStudent(student);
    }

    public int deleteStudentById(int id) {
        return studentDao.deleteStudentById(id);
    }

    public Student queryStudent(int id) {
        return studentDao.queryStudent(id);
    }

    public List<Student> queryAll() {
        return studentDao.queryAll();
    }

    public List<Student> queryByLimit(int offser, int limit) {
        return studentDao.queryByLimit(offser,limit);
    }

    public int incrementNum(int id) {
        return 0;
    }

    public List<Subject> querySubject(int id, int offset, int limit) {
        return studentDao.querySubject(id,offset,limit);
    }

    /**
    * 方法实现说明
    * @author      ougen
    * @param id 学生id
    * @return   学生选课总数
    */
    @Override
    public int countSubject(int id) {
        return studentDao.countSubject(id);
    }

    /**
    * 方法实现说明
     * 实现学生选课
    * @author      ougen
    * @param studentId 学生id
     *@param subjectId 课程id
    * @return
    */
    @Transactional
    public Result incrementNum(int studentId, int subjectId) {
        if (studentId == 0 || subjectId == 0) {
            return ResultUtil.fail(MyEnum.NOPARAMTER);
        }
        Subject subject = subjectDao.querySubject(subjectId);
        Result result=null;
        if (subject != null){
            if (subject.getNum()>=1){
                Date startTime  = subject.getStartTime();
                Date endTime = subject.getEndTime();
                Date nowTime = getNowTime();
                if (nowTime.compareTo(startTime)<0){
                    return ResultUtil.fail(MyEnum.NOSTART);
                }
                if (nowTime.compareTo(endTime)>0){
                    return ResultUtil.fail(MyEnum.ISEND);
                }
               int redu = subjectDao.reduceNum(subjectId);
                if (redu<=0){
                    throw new UnkwonException();//抛异常回滚
                }
                int inre = studentDao.incrementNum(studentId);
                if (inre <=0){
                    throw new SubjectNumIsOverException();
                }
                int ssnum = studentDao.insertToSS(studentId,subjectId);
                if (ssnum == 0){
                    throw new RepeatChooseSubjectException();
                }
                return ResultUtil.success("选课成功", MyEnum.SUCCESS);
            }else{
                return ResultUtil.fail(MyEnum.NONUM);
            }
        }else{
            result = ResultUtil.fail(MyEnum.NOSUBJECT);
            return result;
        }

    }
    //添加事务
    @Transactional
    public Result reduceNum(int studentId,int subjectId) {
        if (studentId == 0 || subjectId == 0) {
            return ResultUtil.fail(MyEnum.NOPARAMTER);
        }
        Subject subject = subjectDao.querySubject(subjectId);
        Result result=null;
        if (subject != null){
                Date endTime = subject.getEndTime();
                Date nowTime = getNowTime();

                if (nowTime.compareTo(endTime)>0){
                    return ResultUtil.fail(MyEnum.ISEND);
                }
                int inre = subjectDao.incrementNum(subjectId);
                if (inre<=0){
                    throw new UnkwonException();//抛异常回滚
                }
                int redu = studentDao.reduceNum(studentId);
                if(redu<=0){
                    throw new UnkwonException();
                }
                //删除表tb_student_subject的内容
                int  rss=studentDao.reduceToSS(studentId,subjectId);
                if (rss <= 0 ){
                    throw new UnkwonException();
                }
                return ResultUtil.success("退课成功", MyEnum.SUCCESS);

        }else{
            result = ResultUtil.fail(MyEnum.NOSUBJECT);
            return result;
        }
    }
    public Date getNowTime(){
        return new Date();
    }
}
