package com.ougen.dao;

import com.ougen.entity.Student;
import com.ougen.entity.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/1915:54
 */

public interface StudentDao {
    /**
    * 方法实现说明
     * 查询学生总人数
    * @author      ougen
    * @param null
    * @return 学生总人数
    */
    public int countNum();
    /**
    * 方法实现说明
     * 查询学生
    * @author      ougen
    * @param id 学生id
    * @return  查询的学生
    */
    public Student queryStudent(int id);

    /**
    * 方法实现说明
     * 删除学生
    * @author      ougen
    * @param id  学生id
    * @return  删除行数
    */
    public int deleteStudentById(int id);

    /**
    * 方法实现说明
     * 修改学生信息
    * @author      ougen
    * @param student  修改的学生信息
    * @return 影响行数
    */
    public int updateStudent(@Param("student") Student student);

    /**
    * 方法实现说明
    * @author      ougen
     * 添加学生
    * @param student 增加学生信息
    * @return 影响行数
    */
    public int insertStudent(@Param("student") Student student);

    /**
    * 方法实现说明
     * 查询所有学生
    * @author      ougen
    * @param null
    * @return    所有学生
    */
    public List<Student> queryAll();

    /**
    * 方法实现说明
     * 按条数查询学生
    * @author      ougen
    * @param offset 其实位置
     * @param limit 查询条数
    * @return  学生列表
    */
    public List<Student> queryByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
    * 方法实现说明
     *增加课程
     * @author      ougen
     * @param id 学生id
     * @return 影响记录
     */
    public int incrementNum(int id);

    /**
    * 方法实现说明
    * @author      ougen
     * student_subject表插入记录
    * @param studentId 学生Id
     * @param subjectId 课程id
    * @return   影响行数
    */
    public int insertToSS(@Param("studentId") int studentId,@Param("subjectId") int subjectId);

    /**
     * 方法实现说明
     * @author      ougen
     * student_subject表删除记录
     * @param studentId 学生Id
     * @param subjectId 课程id
     * @return   影响行数
     */
    public int reduceToSS(@Param("studentId") int studentId,@Param("subjectId") int subjectId);

    /**
    * 方法实现说明
     * 退课
    * @author      ougen
    * @param id 学生id
    * @return  影响行数
    */
    public int reduceNum(int id);

    /**
     * 方法实现说明
     * @author      ougen
     * @param id 学生id
     * @param offset 起始位置
     * @param limit 查询数量
     * @return  学生信息和所选课程
     */
    public List<Subject> querySubject(@Param("id") int id, @Param("offset") int offset, @Param("limit") int limit);

    public int countSubject(int id);
}
