package com.iamning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.UnsupportedEncodingException;

@Controller
public class EncodingController {
    //使用过滤器解决乱码问题
    @PostMapping ("/e/t")
    public String test1(String name, Model model) throws UnsupportedEncodingException {
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }
}
