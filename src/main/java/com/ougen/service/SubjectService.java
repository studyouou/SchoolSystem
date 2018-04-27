package com.ougen.service;

import com.ougen.Enum.MyEnum;
import com.ougen.dao.SubjectDao;
import com.ougen.dto.Page;
import com.ougen.dto.Result;
import com.ougen.entity.Subject;
import com.ougen.service.impl.SubjectServiceImpl;
import com.ougen.util.PageUtil;
import com.ougen.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/2014:35
 */
@Service
public class SubjectService implements SubjectServiceImpl{

    @Autowired
    private SubjectDao subjectDao;

    @Override
    public List<Subject> queryAllSubjects() {
        return subjectDao.queryAll();
    }

    @Override
    public Result queryByLimit( int limit,int currentPage ,int count) {
        Page<Subject> page = PageUtil.createPage(count,currentPage,limit);
        List<Subject> subjects = subjectDao.queryByLimit(page.getBegin(),limit);

        page.setList(subjects);
        return ResultUtil.success(page, MyEnum.SUCCESS);
    }

    @Override
    public int countSubject() {
        int count = subjectDao.countNum();
        return count;
    }
}
