package com.ougen.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ougen.Enum.MyEnum;

/**
 * @author:ougen
 * @date:2018/4/2016:43
 */
@JsonIgnoreProperties
public class Result<T> {
    public Result() {

    }

    public Result(MyEnum myEnum, T data) {
        this.code=myEnum.getCode();
        this.msg=myEnum.getMsg();
        this.data = data;
    }
    public Result(MyEnum myEnum){
        this.code=myEnum.getCode();
        this.msg=myEnum.getMsg();
    }
    //状态信息
    private int code;

    //信息消息
    private String msg;

    //具体数据
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
