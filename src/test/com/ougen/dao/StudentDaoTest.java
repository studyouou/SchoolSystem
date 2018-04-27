package com.ougen.dao;


import com.ougen.entity.Student;
import com.ougen.entity.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/1920:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class StudentDaoTest {
    private final Logger logger = LoggerFactory.getLogger(StudentDaoTest.class);
    @Autowired
    private StudentDao studentDao;

    @Test
    public void countNum(){
       int i = studentDao.countNum();
       logger.info("i={}",i);
    }
    @Test
    public void queryStudent() {
       Student student = studentDao.queryStudent(1000);
       logger.info("student{}" , student);
    }

    @Test
    public void deleteStudentById() {

    }

    @Test
    public void updateStudent() {
        Student student = studentDao.queryStudent(1005);
        student.setMajor("软件工程");
        int i=studentDao.updateStudent(student);
        logger.info("num={}",i);
    }

    @Test
    public void insertStudent() {
        Student student=new Student();
        student.setAge(17);
        student.setMajor("法律学");
        student.setIdCard("63215498456123542");
        student.setPassword("123542");
        student.setInSchoolTime(new Date());
        student.setName("李小翠");
        student.setMaxnum(12);
        student.setNum(0);
        student.setSex("女");
        int i=studentDao.insertStudent(student);
        logger.info("num={}",i);
    }

    @Test
    public void queryAll() {
        List list=studentDao.queryAll();
        logger.info("list={}",list);
    }

    @Test
    public void queryByLimit() {
        List list=studentDao.queryByLimit(0,4);
        logger.info("list={}",list);
    }

    @Test
    public void incrementNum() {
        int i=studentDao.incrementNum(1005);
        logger.info("num={}",i);
    }

    @Test
    public void reduceNum() {
        int i=studentDao.reduceNum(1000);
        logger.info("num={}",i);
    }

    @Test
    public void querySubject() {
        List<Subject> subjects=studentDao.querySubject(1005,0,4);
        logger.info("subjects={}",subjects);
    }
}
