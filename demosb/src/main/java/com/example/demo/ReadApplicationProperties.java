package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadApplicationProperties implements InitializingBean {

    @Value("${server.port}")
    public String port;

    @Value("${string.str1}")
    public String str1;

    @Value("${string.str2}")
    public String str2;

    @Value("${string.str3}")
    public String str3;



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("port--->"+port);
        System.out.println("str1--->"+str1);
        System.out.println("str2--->"+str2);
        System.out.println("str3--->"+str3);
    }
}
