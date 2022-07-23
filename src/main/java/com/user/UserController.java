package com.user;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public void seyHello(String name){
        System.out.println("UserController Say Hello "+name);
    }

}
