package com.user;

import com.user.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * 出生不同: @Autowired 来自 Spring 框架, @Resource 来自 JDK
 * 作用范围不同: @Autowired 可以进行属性注入, 构造方法注入, Setter 注入. @Resource 可以进行 属性注入, Setter注入, 不能使用构造方法注入.
 * 功能不同: 相比于 @Autowired, @Resource 支持更多的参数设置, 例如 name设置, 根据名称获取 Bean
 */
@Controller
public class UserControllerB {

    /**
     * 属性注入 :
     * 优点: 简洁, 使用方便
     * 缺点: 只能用于 IoC 容器, 如果是非 IoC 容器不可用, 并且只有在使用的时候才会出现 NPE (空指针异常)
     */
    @Autowired
    @Qualifier(value = "getUser1")
//    @Resource(name = "getUser2")
    public User user;

    public User getUser(){ return user; }

}
