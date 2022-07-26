package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody
    public String HelloWorld(String name){
        return "Hello World!"+name;
    }

    @RequestMapping("/log")
    @ResponseBody
    public String printLog(){
        log.error("error");
        return "Log";
    }

}