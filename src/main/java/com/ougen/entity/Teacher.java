package com.ougen.entity;

import java.util.Date;
import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/1915:45
 */
public class Teacher {
    private int id;

    //老师姓名
    private String name;

    //老师年龄
    private int age;

    //老师性别
    private String sex;

    //密码
    private String password;

    //专业
    private String major;

    //入教时间
    private Date teachTime;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", major='" + major + '\'' +
                ", teachTime=" + teachTime +
                ", idCard='" + idCard + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    //身份证号
    private String idCard;

    //所授课程
    private List<Subject> subjects;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getTeachTime() {
        return teachTime;
    }

    public void setTeachTime(Date teachTime) {
        this.teachTime = teachTime;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
