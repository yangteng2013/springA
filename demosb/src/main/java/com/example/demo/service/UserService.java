package com.example.demo.service;

import com.example.demo.bean.Blog;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

    public Integer insert(User user) {
       return userMapper.insert(user);
    }

    public User findByUserIdWithName(int userId, String name) {
        return userMapper.findUserByUserIdWithName(userId,name);
    }

    public User findByUserId(int userId) {
        return userMapper.findByUserId(userId);
    }

    public User findByUserName(String name) {
        return userMapper.findUserByUserName(name);
    }

    public Integer update(User user) {
        if (user.getUserId()>0) {
            return userMapper.updateById(user);
        }else {
            return userMapper.updateByName(user);
        }
    }

    public Integer delete(User user) {
        return userMapper.delete(user);
    }

    public List<Blog> getAllBlog() {
        return userMapper.getAllBlog();
    }

    public List<Blog> getBlogsByUserId(int userId) {
        return userMapper.getBlogByUserId(userId);
    }
}
