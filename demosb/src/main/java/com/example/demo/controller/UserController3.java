package com.example.demo.controller;

import com.example.demo.bean.Blog;
import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/user3")
public class UserController3 {

    @Autowired
    private UserService userService;

    /**
     * http://localhost:9090/user3/getAllUser
     * @return
     */
    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    /**
     * http://localhost:9090/user3/insert?username=YangFP&password=mn_kjj
     * @param user
     * @return
     */
    @RequestMapping("/insert")
    public Integer insert(User user){
//        return userService.insert(user);
        userService.insert(user);
        //返回自增值
        return user.getUserId();
    }

    /**
     * http://localhost:9090/user3/getUser?userId=0&name=liuer
     * @param userId
     * @param name
     * @return
     */
    @RequestMapping("/getUser")
    public User findByParam(int userId,String name){
        System.out.println("start:"+userId+" " +name);
        if (userId<=0 && !StringUtils.hasText(name)) {
            return null;
        }
        boolean byUser = userId>0 && StringUtils.hasText(name);
        if (byUser){
            System.out.println("start2:"+userId+" " +name);
            return userService.findByUserIdWithName(userId,name);
        }else {
            System.out.println("start3:"+(userId+" " +name));
            return userId>0?userService.findByUserId(userId):userService.findByUserName(name);
        }
    }

    /**
     * http://localhost:9090/user3/update?userId=0&username=liuer&password=90902a
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public Integer update(User user){
        return userService.update(user);
    }

    @RequestMapping("/delete")
    public Integer delete(User user){
        return userService.delete(user);
    }



    @RequestMapping("/getAllBlog")
    public List<Blog> getAllBlog(){
        return userService.getAllBlog();
    }

    /**
     * http://localhost:9090/user3/getBlogsByUserId?userId=3
     * @param userId
     * @return
     */
    @RequestMapping("/getBlogsByUserId")
    public List<Blog>getBlogsByUserId(int userId){
        return userService.getBlogsByUserId(userId);
    }


}
