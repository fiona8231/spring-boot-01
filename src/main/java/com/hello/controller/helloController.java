package com.hello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @ResponseBody
    @RequestMapping("/index")
    public String hello(){
     return "Hello World";
    }
}
