package com.user;

import com.user.bean.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    public void sayHello(String name){
        System.out.println("UserService say Hello "+name);
    }

    public User findUserById(int id){
        // 伪代码 返回用户对象
        User user = new User();
        if (id == 1){
            user.setId(1);
            user.setName("张三");
            user.setAge(18);
        }else if (id == 2){
            user.setId(2);
            user.setName("王五");
            user.setAge(19);
        }else {
            user.setId(3);
            user.setName("李四");
            user.setAge(20);
        }
        return user;
    }
}
