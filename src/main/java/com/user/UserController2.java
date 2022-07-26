package com.user;

import com.user.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController2 {

    public void seyHello(String name){
        System.out.println("UserController Say Hello "+name);
    }

    public UserService userService;

    /**
     * 构造方法注入 : Spring官方推荐的注入方式
     * 优点: 通用性, 在使用之前一定能保证注入的类不为空
     * 缺点: 如果有多个注入会显得比较臃肿
     * @param userService
     */
    @Autowired
    public UserController2(UserService userService) {
        this.userService = userService;
    }

    public User findUserById(int id){
        return id<=0?new User():userService.findUserById(id);
    }

}
