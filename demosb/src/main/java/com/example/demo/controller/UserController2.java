package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user1")
public class UserController2 {
    @RequestMapping("/index")
    public Object reIndex() {
        return "/index.html";
    }
}