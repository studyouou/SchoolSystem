package com.ougen.service.impl;

import com.ougen.dto.Result;
import com.ougen.entity.Subject;

import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/2014:34
 */
public interface SubjectServiceImpl {
    /**
    * 方法实现说明
     * 查询所有课程
    * @author      ougen
    * @param
    * @return
    */
    public List<Subject> queryAllSubjects();

    /**
    * 方法实现说明
    * @author      ougen
    * @param offset 起点位置
     * @param limit 查询条数
    * @return   课程集合
    */
    public Result queryByLimit(int limit,int currentPage,int count);

    /**
    * 方法实现说明
     *
    * @author      ougen
    * @param null
    * @return  返回总数
    */
    public int countSubject();
}
