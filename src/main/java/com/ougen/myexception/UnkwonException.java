package com.ougen.myexception;

import com.ougen.Enum.MyEnum;

/**
 * @author:ougen
 * @date:2018/4/2022:14
 */
public class UnkwonException extends RuntimeException{
    public UnkwonException(){
        super(MyEnum.UNKWONWRONG.getMsg());
        this.code= MyEnum.UNKWONWRONG.getCode();
    }
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}