create database if not exists MyBlogSystem;

use MyBlogSystem;

drop table if exists blog;

-- 创建一个博客表
create table blog (
                      blogId int primary key auto_increment,
                      title varchar(1024),
                      content mediumtext,
                      postTime datetime,
                      userId int
);

drop table if exists user;

-- 创建一个用户信息表
create table user (
                      userId int primary key auto_increment,
                      username varchar(128) unique,
                      password varchar(128)
);