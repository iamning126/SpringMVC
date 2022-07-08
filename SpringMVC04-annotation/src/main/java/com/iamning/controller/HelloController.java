package com.iamning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    //localhost:8080/hello/h1
    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据和值
        model.addAttribute("msg","Hello,SpringMVCAnnotaion");
        //返回视图
        return "hello";//会被视图解析器处理
    }

}
