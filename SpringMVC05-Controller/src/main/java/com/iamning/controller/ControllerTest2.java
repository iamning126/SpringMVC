package com.iamning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//代表这个类会被Spring接管，
//被这个注解的类，中的所有方法，如果返回值类型是Spring
//并且有具体的页面可以跳转，那么就会别
@Controller
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";//WEB-INF/jsp/test.jsp
    }
}
