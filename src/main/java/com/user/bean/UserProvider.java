package com.user.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class UserProvider {

    @Bean(name = {"u1","u2"})
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("Jully");
        user.setAge(17);
        return user;
    }


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public User getUser1(){
        User user = new User();
        user.setId(3);
        user.setName("Lily");
        user.setAge(17);
        return user;
    }

    @Bean
    public User getUser2(){
        User user = new User();
        user.setId(2);
        user.setName("John");
        user.setAge(19);
        return user;
    }
}
