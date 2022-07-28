package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    @ResponseBody
    public String HelloWorld(String name){
        return "Hello World! "+name;
    }

    @RequestMapping("/log")
    @ResponseBody
    public String printLog(){
        log.error("error");
        return "Log";
    }

    @PostMapping("/yoop")
    @ResponseBody
    public String sey(String name){
        return "Yooup "+name;
    }

    @RequestMapping("/register")
    @ResponseBody
    public Employee register(Employee employee){
        return employee;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username,String password){
        return username+" "+ password;
    }

    /**
     * Json对象
     * @param employee
     * @return
     */
    @RequestMapping("/detail")
    @ResponseBody
    public Object getDetail(@RequestBody Employee employee){
        return employee;
    }

    @RequestMapping("/time")
    @ResponseBody
    public String getTime(@RequestParam("time") String createTime){
        return "time:"+createTime;
    }

    @RequestMapping("/{name}/{password}")
    @ResponseBody
    public String loginByPathVar(@PathVariable String name,@PathVariable String password){
        return "姓名："+name + " 密码："+password;
    }

    /**上传文件
     * https://wangzhi430.blog.csdn.net/article/details/125113957
     */

//    @Value("${upload.path}")
//    public String uploadPath;
//
//    @RequestMapping("/upload")
//    public String upload(@RequestPart("myfile") MultipartFile file) throws IOException {
//
//        String basePath = uploadPath;
//        String fileName = UUID.randomUUID()+file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
//        file.transferTo(new File(basePath+fileName));
//
//        return "上传成功";
//    }

    @Value("${upload.path}")
    public String uploadPath;

    @RequestMapping(value = "/upload",method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(@RequestPart("file") MultipartFile file) throws IOException {
        // 1. 上传文件目录
        String basePath = uploadPath;
        // 2. 生成动态的文件名
        String fileName = UUID.randomUUID() + (file.getOriginalFilename().substring(file.getOriginalFilename().indexOf(".")));
        // 3. 保存文件
        file.transferTo(new File(basePath + fileName));
        return "上传成功";
    }


}