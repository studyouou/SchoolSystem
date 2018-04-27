package com.ougen.dao;

import com.ougen.entity.Subject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author:ougen
 * @date:2018/4/2014:13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SubjectDaoTest {
    private final Logger logger= LoggerFactory.getLogger(SubjectDaoTest.class);
    @Autowired
    private SubjectDao subjectDao;
    @Test
    public void countNum(){
        int i = subjectDao.countNum();
        logger.info("i={}",i);
    }
    @Test
    public void querySubject() {
        Subject subject=subjectDao.querySubject(2);
        logger.info("subject={}",subject);
    }

    @Test
    public void deleteSubjectById() {

    }

    @Test
    public void updateSubject() {
        Subject subject=subjectDao.querySubject(1);
        subject.setHours(24);
        subjectDao.updateSubject(subject);
    }

    @Test
    public void insertSubject() {
        Subject subject = new Subject();
        subject.setHours(32);
        subject.setName("javaWeb应用开发");

        subject.setNum(100);
        try {
            subject.setStartTime(new SimpleDateFormat("yyyy-MM-dd").parse("2018-08-01"));
            subject.setEndTime(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-10"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        subjectDao.insertSubject(subject);
    }

    @Test
    public void queryAll() {
        List<Subject> subjects=subjectDao.queryAll();
        logger.info("subjects={}",subjects);
    }

    @Test
    public void queryByLimit() {
        List<Subject> subjects=subjectDao.queryByLimit(0,4);

        logger.info("subjects={}",subjects);
    }

    @Test
    public void reduceNum() {
    }

    @Test
    public void incrementNum() {
    }
}
