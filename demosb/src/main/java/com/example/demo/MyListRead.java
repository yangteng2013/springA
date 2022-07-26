package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyListRead implements InitializingBean {

    @Autowired
    private MyList myList;


    @Override
    public void afterPropertiesSet() throws Exception {

        for (String color : myList.getColors()) {
            System.out.print(color + "\t");
        }
        System.out.println();
    }
}
