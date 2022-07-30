package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Setter
@Getter
@ToString
public class Blog {
    public int blogId;
    public String title;
    public String content;
    public Timestamp postTime;
    public int userId;
    public User user;

}
