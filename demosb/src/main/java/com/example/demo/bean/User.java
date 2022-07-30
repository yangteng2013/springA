package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    public int userId;
    public int blogNumbers;
    public String username;
    public String password;
    public String imageUrl;

}
