package com.ougen.myexception;

import com.ougen.Enum.MyEnum;

/**
 * @author:ougen
 * @date:2018/4/2522:48
 */
public class StudentNumOverException extends RuntimeException {
    public StudentNumOverException(){
        super(MyEnum.NUMOVER.getMsg());
        code = MyEnum.NUMOVER.getCode();
    }
    private int code ;
    private String msg;

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
}
