package com.user;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void sayHello(String name){
        System.out.println("UserRepository say Hello "+name);
    }
}
