package com.user;

import org.springframework.stereotype.Component;

@Component
public class UserComponent {
    public void sayHello(String name){
        System.out.println("UserComponent say Hello "+name);
    }
}
