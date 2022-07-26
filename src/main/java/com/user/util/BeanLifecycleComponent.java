package com.user.util;

import org.springframework.beans.factory.BeanNameAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleComponent implements BeanNameAware {
    @Override
    public void setBeanName(String s) {
        System.out.println("执行通知: BeanNameAware:"+s);
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("执行 @PostConstruct");
    }
    public void init() {
        System.out.println("执行 init-method");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("执行 @PreDestroy");
    }
    public void destroy() {
        System.out.println("执行 destroy");
    }

}
