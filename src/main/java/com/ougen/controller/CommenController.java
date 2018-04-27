package com.ougen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:ougen
 * @date:2018/4/2522:01
 */
@Controller
public class CommenController {
   @RequestMapping("/index")
    public String index(){
        return "/common/index";
    }
}
