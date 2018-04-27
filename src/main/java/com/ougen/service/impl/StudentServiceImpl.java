package com.ougen.service.impl;

import com.ougen.dto.Result;
import com.ougen.entity.Student;
import com.ougen.entity.Subject;

import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/2014:37
 */

public interface StudentServiceImpl {

    // * 添加学生
    int insertStudent(Student student);

    // * 修改学生信息
    int updateStudentInfo(Student student);


    //* 删除学生
    int deleteStudentById(int id);

    // * 查询学生
    public Student queryStudent(int id);

    // 查询所有学生
    public List<Student> queryAll();

    //*分页查询
    public List<Student> queryByLimit(int offser, int limit);

    //*添加课程
    public Result incrementNum(int studentId, int subjectId);

    //退课
    public Result reduceNum(int studentId, int subjectId);

    //*查看学生课程
    public List<Subject> querySubject(int id, int offset, int limit);

    /**
    * 方法实现说明
    * @author      ougen
    * @param id 学生id
    * @return   学生选课总数
    */
    public int countSubject(int id);
}
