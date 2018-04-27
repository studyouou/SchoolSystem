package com.ougen.controller;

import com.ougen.Enum.MyEnum;
import com.ougen.dto.Page;
import com.ougen.dto.Result;
import com.ougen.entity.Student;
import com.ougen.entity.Subject;
import com.ougen.service.impl.StudentServiceImpl;
import com.ougen.service.impl.SubjectServiceImpl;
import com.ougen.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:ougen
 * @date:2018/4/2023:26
 */
@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private SubjectServiceImpl subjectService;

    //跳转操作
    @RequestMapping("/dispacher/login")
    public String toLogin(){
        return "/student/login";
    }


    //跳转主页
    @RequestMapping("/student/index")
    public String toIndex(){
        return "/student/student_index";
    }
    //登录操作
    @RequestMapping(value = "/student/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request , HttpSession session , HttpServletResponse response){
        Map<String,String> error = new HashMap();
        String stringId = request.getParameter("id");
        String ps = request.getParameter("password");
        if (stringId==null || "".equals(stringId)){
            error.put("name","用户名不能为空");
            request.setAttribute("error",error);
            return "/student/login";
        }
        if (ps==null || "".equals(ps)){
            error.put("password","密码不能为空");
            request.setAttribute("error",error);
            return "/student/login";
        }
        int id = Integer.parseInt(stringId);
        Student jdStudent = studentService.queryStudent(id);
        if (jdStudent == null){
            error.put("name","用户不存在");
            request.setAttribute("error",error);
            return "/student/login";
        }
        if (jdStudent.getPassword().equals(ps)){
            session.setAttribute("student",jdStudent);
            //将用户名存入cookie
           Cookie cookie = new Cookie("student",stringId);
           cookie.setPath("/");
           cookie.setMaxAge(60*60);
           response.addCookie(cookie);
            return "/student/student_index";
        }else {
            error.put("password","密码错误，请重新输入");
            request.setAttribute("error",error);
            return "/student/login";
        }
    }
    //跳转到update界面
    @RequestMapping("/student/updateindex")
    public String update(){
        return "/student/updateindex";
    }

    //修改密码操作
    @RequestMapping(value = "/student/updatePassword",method = RequestMethod.POST)
    public @ResponseBody Result updatePassword(HttpServletRequest request){
         String oldPassword = request.getParameter("oldPassword");
         String  newPassword = request.getParameter("newPassword");
         String rePassword = request.getParameter("rePassword");
         Student student = ((Student)request.getSession().getAttribute("student"));
         String password = student.getPassword();
         Result result = null ;
         System.out.println("read in");
         if (oldPassword==null || "".equals(oldPassword)){
             result = new Result(MyEnum.NOTNULLPASSWORD);
             return  result;
         }
         if ( !oldPassword.equals(password)){
             result = new Result(MyEnum.WRONGPASSWORD) ;
             return result;
        }
        if (rePassword==null || "".equals(rePassword)){
             result = new Result(MyEnum.NOTNULLPASSWORD);
             return result;
        }
        if (!rePassword.equals(newPassword)){
             result = new Result(MyEnum.REPASSWORDWRONG);
        }
        student.setPassword(newPassword);
        studentService.updateStudentInfo(student);
        System.out.println("修改成功");
        return new Result(MyEnum.SUCCESS);
    }

    //详细页
    @RequestMapping(value = "/student/detail" , method = RequestMethod.GET)
    public String detailMessage(){
        //一系列信息 todo
        return "/student/student_detail";
    }

    //选课页跳转
    @RequestMapping("/student/{currentPage}/chooseSujectindex")
    public String chooseSubjectindex(@PathVariable int currentPage, Model model){
        int count = subjectService.countSubject();
        Result subjectResult = subjectService.queryByLimit(10,currentPage,count);
        model.addAttribute("page",subjectResult.getData());
        System.out.println(subjectResult.getData());
        return "/student/student_choose";
    }
    //翻页
//    @RequestMapping("/student/{currentPage}/chooseSubject")
//    @ResponseBody
//    public Result pageNumGo(@PathVariable("currentPage") int currentPage){
//        Result result = subjectService.queryByLimit(10,currentPage);
//        return result;
//    }
    //选课
    @RequestMapping("/student/choose/submit/{studentId}/{subjectId}/subject")
    @ResponseBody
    public Result chooseSubmitSubject(@PathVariable("studentId") int studentId,@PathVariable("subjectId") int subjectId){
        Result result = studentService.incrementNum(studentId,subjectId);
        return  result;
    }

    //跳转已选课程
    @RequestMapping("/student/{id}/{currentPage}/searchAllSubjects")
    public String toDetailAllSubject(@PathVariable("currentPage") int currentPage, @PathVariable("id") int id){
        int count = studentService.countSubject(id);
        Result result = subjectService.queryByLimit(10,currentPage,count);
        return "/student/student_subject";
    }

    //退课
    @RequestMapping(value = "/student/query/{studentId}/{subjectId}/subject",method = RequestMethod.GET)
    @ResponseBody
    public Result querySubject(@PathVariable("studentId") int studentId,@PathVariable("subjectId") int subjectId){
        Result result = studentService.reduceNum(studentId,subjectId);
        return result;
    }

    //退出操作
    @RequestMapping("/student/exit")
    public String exit(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("student");
        return "/common/index";
    }
}
