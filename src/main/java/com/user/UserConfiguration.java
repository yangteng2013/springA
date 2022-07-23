package com.user;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    
    public void sayHello(String name){
        System.out.println("UserConfiguration say Hello "+name);
    }
}
