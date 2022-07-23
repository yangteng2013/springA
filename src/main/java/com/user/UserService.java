package com.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    public void sayHello(String name){
        System.out.println("UserService say Hello "+name);
    }
}
