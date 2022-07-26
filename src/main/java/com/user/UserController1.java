package com.user;

import com.user.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController1 {

    public void seyHello(String name){
        System.out.println("UserController Say Hello "+name);
    }

    public UserService userService;

    /**
     * Setter 注入 : 通用性不如构造方法
     * @param userService
     */
//    @Autowired
    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User findUserById(int id){
        return id<=0?new User():userService.findUserById(id);
    }

}
