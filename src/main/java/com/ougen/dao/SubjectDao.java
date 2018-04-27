package com.ougen.dao;

import com.ougen.entity.Subject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/1915:55
 */
public interface SubjectDao {

    /**
    * 方法实现说明
    * @author      ougen
     * 查询课程总数
    * @param null
    * @return  课程总数
    */
    public int countNum();

    /**
     * 方法实现说明
     * 查询课程
     * @author      ougen
     * @param id 课程id
     * @return  查询的课程
     */
    public Subject querySubject(int id);

    /**
     * 方法实现说明
     * 删除课程
     * @author      ougen
     * @param id  课程id
     * @return  删除行数
     */
    public int deleteSubjectById(int id);

    /**
     * 方法实现说明
     * 修改课程信息
     * @author      ougen
     * @param subject  修改的课程信息
     * @return 影响行数
     */
    public int updateSubject(@Param("subject") Subject subject);

    /**
     * 方法实现说明
     * @author      ougen
     * 添加课程
     * @param subject 增加课程信息
     * @return 影响行数
     */
    public int insertSubject(@Param("subject") Subject subject);

    /**
     * 方法实现说明
     * 查询所有课程
     * @author      ougen
     * @param null
     * @return    所有课程
     */
    public List<Subject> queryAll();

    /**
     * 方法实现说明
     * 按条数查询课程
     * @author      ougen
     * @param offset 其实位置
     * @param limit 查询条数
     * @return  课程列表
     */
    public List<Subject> queryByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
    * 方法实现说明
     * 减少课程数
    * @author      ougen
     * 减少课程数量
    * @param id 课程id
     * @param nowTime 当前时间
    * @return  影响行数
    */
    public int reduceNum(@Param("id") int id);

    /**
    * 方法实现说明
     * 增加课程数量
    * @author      ougen
    * @param id 课程id
     * @param nowTime 当前时间
    * @return 影响行数
    */
    public int incrementNum(@Param("id") int id);
}
