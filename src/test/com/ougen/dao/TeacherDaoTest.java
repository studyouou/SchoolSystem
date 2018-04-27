package com.ougen.dao;

import com.ougen.entity.Subject;
import com.ougen.entity.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author:ougen
 * @date:2018/4/2012:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TeacherDaoTest {

    private final Logger logger = LoggerFactory.getLogger(TeacherDaoTest.class);

    @Autowired
    private TeacherDao teacherDao;
    @Test
    public void countNum(){
        int i = teacherDao.countNum();
        logger.info("i={}",i);
    }
    @Test
    public void queryTeacher() {
        Teacher teacher=teacherDao.queryTeacher(1000);
        logger.info("teacher={}",teacher);
    }

    @Test
    public void deleteTeacherById() {

    }

    @Test
    public void updateTeacher() {
        Teacher teacher = teacherDao.queryTeacher(1000);
        teacher.setAge(71);
        teacherDao.updateTeacher(teacher);
    }

    @Test
    public void insertTeacher() {
        Teacher teacher=new Teacher();
        teacher.setAge(26);
        teacher.setIdCard("456321544532154215");
        teacher.setPassword("154215");
        teacher.setMajor("体育学");
        teacher.setName("王晓婷");
        teacher.setSex("女");
        teacher.setTeachTime(new Date());
        int i = teacherDao.insertTeacher(teacher);
        logger.info("num={}",i);
    }

    @Test
    public void queryAll() {
        List<Teacher> teachers = teacherDao.queryAll();
        logger.info("teachers={}",teachers);
    }

    @Test
    public void queryTeacherByLimit() {
        List<Teacher> teachers=teacherDao.queryTeacherByLimit(0,4);
        logger.info("num={}",teachers.size());
    }

    @Test
    public void querySubject() {
        List<Subject> subjects=teacherDao.querySubject(1000,0,2);
        logger.info("size={}",subjects);

    }
}
