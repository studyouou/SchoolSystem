package com.ougen.entity;

import java.util.Date;

/**
 * @author:ougen
 * @date:2018/4/1915:48
 */
public class Subject {
    private int id;

    //课程名
    private String name;
    //老师
    private String teacherName;
    //人数
    private int num;
    //学时
    private int hours;
    //报名时间
    private Date startTime;
    //结束时间
    private Date endTime;

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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", num=" + num +
                ", hours=" + hours +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
