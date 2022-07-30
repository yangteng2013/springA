package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * https://wangzhi430.blog.csdn.net/article/details/125137029
 */
@Mapper
public interface UserMapper {
    List<User> getAll();

    /**
     *
     * @param user 不可以省略，否则null
     * @return
     */
    Integer insert(User user);

    User findUserByUserIdWithName(int userId, String name);

    User findByUserId(int userId);

    User findUserByUserName(String name);

    Integer updateById(User user);
    Integer updateByName(User user);

    Integer delete(User user);
}
