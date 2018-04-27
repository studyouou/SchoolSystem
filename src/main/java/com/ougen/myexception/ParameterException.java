package com.ougen.myexception;

import com.ougen.Enum.MyEnum;

/**
 * @author:ougen
 * @date:2018/4/2016:27
 * 自定义参数异常
 */
public class ParameterException extends RuntimeException{
    public ParameterException(MyEnum myEnum){
        super(myEnum.getMsg());
        this.code=myEnum.getCode();
    }
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
