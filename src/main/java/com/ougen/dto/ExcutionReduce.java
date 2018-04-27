package com.ougen.dto;

import java.util.Date;

/**
 * @author:ougen
 * @date:2018/4/2018:06
 */
public class ExcutionReduce {

    public ExcutionReduce(int id, Date nowTime, Date startTime, Date endTime) {
        this.id = id;
        this.nowTime = nowTime;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    //课程ID
    private int id;

    private Date nowTime;

    private Date startTime;

    private Date endTime;

    public Date getNowTime() {
        return nowTime;
    }

    public void setNowTime(Date nowTime) {
        this.nowTime = nowTime;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
