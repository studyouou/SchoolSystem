package com.ougen.myexception;

import com.ougen.Enum.MyEnum;

/**
 * @author:ougen
 * @date:2018/4/2523:56
 */
//重复选课异常
public class RepeatChooseSubjectException extends  RuntimeException{
    public RepeatChooseSubjectException(){
        super(MyEnum.REPEATCHOOSESUBJECT.getMsg());
        this.code = MyEnum.REPEATCHOOSESUBJECT.getCode();
    }
    private int code;
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
