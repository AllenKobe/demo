package com.example.com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWord {
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "hello world她她她执行政策  SDSSS 123123";
    }
    @RequestMapping("/main")
    public String main(){
        return "hello.jsp";
    }

}
