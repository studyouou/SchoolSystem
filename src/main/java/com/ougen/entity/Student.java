package com.ougen.entity;

import java.util.Date;
import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/1915:36
 */
public class Student {
    private int id;

    //学生姓名
    private String name;

    //学生年龄
    private int age;

    //学生性别
    private String sex;

    //选课数
    private int num;

    //最大选课数
    private int maxnum;
    //密码
    private String password;

    //专业
    private String major;

    //入学时间
    private Date inSchoolTime;

    //身份证号
    private String idCard;

    //所选专业
    private List<Subject> subjects;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public Date getInSchoolTime() {
        return inSchoolTime;
    }

    public void setInSchoolTime(Date inSchoolTime) {
        this.inSchoolTime = inSchoolTime;
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


    public int getMaxnum() {
        return maxnum;
    }

    public void setMaxnum(int maxnum) {
        this.maxnum = maxnum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +

                ", sex='" + sex + '\'' +
                ", num=" + num +
                ", maxnum='" + maxnum + '\'' +
                ", password='" + password + '\'' +
                ", major='" + major + '\'' +
                ", inSchoolTime=" + inSchoolTime +
                ", idCard='" + idCard + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
