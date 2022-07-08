package com.iamning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {
    //RestFul：实现
    //原来的：http://localhost:8081/add?a=1&b=1
    @RequestMapping("/add")
    public String test1(int a, int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为"+res);

        return "test";
    }
    //RestFul：实现 http://localhost:8081/add/a/b
    //@RequestMapping( name = "/add2/{a}/{b}",method = RequestMethod.GET)
    //约束请求的类型

    //http://localhost:8081/add/1/2
    @GetMapping("/add2/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
    @PostMapping ("/add2/{a}/{b}")
    public String test3(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
}
