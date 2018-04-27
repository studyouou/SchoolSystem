package com.ougen.dao;


import com.ougen.entity.Subject;
import com.ougen.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/1915:54
 */
public interface TeacherDao {
    /**
    * 方法实现说明
     * 老师总人数
    * @author      ougen
    * @param null
    * @return  老师总人数
    */
    public int countNum();
    /**
     * 方法实现说明
     * 查询老师
     * @author      ougen
     * @param id 老师id
     * @return  查询的老师；
     */
    public Teacher queryTeacher(int id);

    /**
     * 方法实现说明
     * 删除老师
     * @author      ougen
     * @param id  老师id
     * @return  删除行数
     */
    public int deleteTeacherById(int id);

    /**
     * 方法实现说明
     * 修改老师信息
     * @author      ougen
     * @param teacher  修改的老师信息
     * @return 影响行数
     */
    public int updateTeacher(@Param("teacher") Teacher teacher);

    /**
     * 方法实现说明
     * @author      ougen
     * 添加老师
     * @param teacher 增加老师信息
     * @return 影响行数
     */
    public int insertTeacher(@Param("teacher") Teacher teacher);

    /**
     * 方法实现说明
     * 查询所有老师
     * @author      ougen
     * @param null
     * @return    所有老师
     */
    public List<Teacher> queryAll();

    /**
     * 方法实现说明
     * 按条数查询老师
     * @author      ougen
     * @param offset 起始位置
     * @param limit 查询条数
     * @return  老师列表
     */
    public List<Teacher> queryTeacherByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
    * 方法实现说明
    * @author      ougen
    * @param id 老师id
    * @param offset 起始位置
     * @param limit 查询数量
     * @return  课程列表
    */
    public List<Subject> querySubject(@Param("id") int id, @Param("offset") int offset, @Param("limit") int limit);
}
