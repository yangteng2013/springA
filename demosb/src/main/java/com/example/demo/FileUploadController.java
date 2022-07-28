package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RequestMapping("/uploadFile")
@Slf4j
@Controller
public class FileUploadController {

    @Value("${uploadPath}")
    public String uploadPath;

    @PostMapping
    @ResponseBody
    public String uploadFile(@RequestPart("file") MultipartFile file){
        // 1. 上传文件目录
        String basePath = uploadPath;
        System.out.println("getOriginalFilename:"+file.getOriginalFilename()+file.getSize() + "  "+uploadPath);
        // 2. 生成动态的文件名
        String fileName = UUID.randomUUID() + (file.getOriginalFilename().substring(file.getOriginalFilename().indexOf(".")));
        // 3. 保存文件
        try {
            file.transferTo(new File(basePath + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "upload File Successed!";
    }

}
