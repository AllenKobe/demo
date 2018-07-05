package com.example.com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @RequestMapping("/test")
    public String test(){
        return "hello world她她她SDSSS 123123";
    }
}
