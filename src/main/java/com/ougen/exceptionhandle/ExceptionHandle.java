package com.ougen.exceptionhandle;

import com.ougen.Enum.MyEnum;
import com.ougen.dto.Result;
import com.ougen.myexception.RepeatChooseSubjectException;
import com.ougen.myexception.StudentNumOverException;
import com.ougen.myexception.SubjectNumIsOverException;
import com.ougen.myexception.ParameterException;
import com.ougen.util.ResultUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author:ougen
 * @date:2018/4/2017:06
 * 异常捕获类
 */
@EnableWebMvc
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof ParameterException){
            return ResultUtil.fail(MyEnum.FAIL);
        }
        if (e instanceof SubjectNumIsOverException){
            return ResultUtil.fail(MyEnum.NONUM);
        }
        if (e instanceof StudentNumOverException){
            return ResultUtil.fail(MyEnum.NUMOVER);
        }
        if (e instanceof RepeatChooseSubjectException){
            return ResultUtil.fail(MyEnum.REPEATCHOOSESUBJECT);
        }
        
        return new Result(MyEnum.UNKWONWRONG);
    }
}
