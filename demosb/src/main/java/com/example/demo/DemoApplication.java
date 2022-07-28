package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * https://wangzhi430.blog.csdn.net/article/details/125113957
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CommonsMultipartResolver multipartResolver = context.getBean("multipartResolver",CommonsMultipartResolver.class);
		SpringApplication.run(DemoApplication.class, args);

	}

}
