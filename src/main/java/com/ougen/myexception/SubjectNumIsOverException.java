package com.ougen.myexception;

import com.ougen.Enum.MyEnum;

/**
 * @author:ougen
 * @date:2018/4/2022:19
 */
public class SubjectNumIsOverException extends RuntimeException {
    public SubjectNumIsOverException(){
        super(MyEnum.NUMOVER.getMsg());
        this.code= MyEnum.NUMOVER.getCode();
    }
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
