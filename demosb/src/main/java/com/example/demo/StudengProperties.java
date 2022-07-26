package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudengProperties implements InitializingBean {

    @Autowired
    public Student student;


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(student);
    }
}
