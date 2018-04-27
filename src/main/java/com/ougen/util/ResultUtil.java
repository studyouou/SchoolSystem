package com.ougen.util;

import com.ougen.Enum.MyEnum;
import com.ougen.dto.Result;

/**
 * @author:ougen
 * @date:2018/4/2018:55
 */
public class ResultUtil {
    public static Result success(Object object, MyEnum myEnum){
        Result result = new Result();
        result.setCode(myEnum.getCode());
        result.setMsg(myEnum.getMsg());
        result.setData(object);
        return result;
    }
    public static Result fail(MyEnum myEnum){
        Result result = new Result(myEnum);
        return result;
    }
}
