package com.ougen.interceptor;


import com.ougen.entity.Student;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author:ougen
 * @date:2018/4/2114:27
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        String uri = request.getRequestURI();
        if (uri.contains("/student/login")){
            return true;
        }
        HttpSession session = request.getSession();
        Student student = (Student) session.getAttribute("student");
        if (student == null){
            request.getRequestDispatcher("/WEB-INF/jsp/student/login.jsp").forward(request,response);
            return false;
        }else {
            return true;
        }
    }
}
