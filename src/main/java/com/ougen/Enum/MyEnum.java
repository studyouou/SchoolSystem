package com.ougen.Enum;

/**
 * @author:ougen
 * @date:2018/4/2016:32
 */
//自定义信息
public enum MyEnum {
    SUCCESS(1,"成功"),
    FAIL(0,"失败"),
    UNKWONWRONG(-1,"未知错误"),
    NOPARAMTER(-2,"请输入信息"),
    NOSUBJECT(-3,"不存在该课程,请重新输入"),
    NONUM(-4,"该课程人满，请选择其他课程"),
    NOSTART(-5,"该课程还未开启"),
    ISEND(-6,"选课时间结束"),
    NUMOVER(-7,"选课超量"),
    NOTNULLPASSWORD(-8,"所输入密码不能为空"),
    WRONGPASSWORD(-9,"密码错误"),
    REPASSWORDWRONG(-10,"请输入相同的密码"),
    REPEATCHOOSESUBJECT(-11,"该课程已选,请选择其他课程");
    private int code;

    private String msg;

    MyEnum(int code, String msg){
        this.code=code;
        this.msg=msg;
    }

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
