package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/resp")
@Slf4j
public class ResonpseController {

    @RequestMapping("/index")
    public Object reIndex(){
        return "D:\\workspace\\IdeaProjects\\springA\\demosb\\src\\main\\resources\\web\\index.html";
    }

    @RequestMapping("/text")
    @ResponseBody
    public String reText() {
        return "<h1>HEllo!,MMMLL</h1>";
    }

    /**
     * http://localhost:9090/resp/json
     * @return
     */
    @RequestMapping("/json")
    @ResponseBody
    public HashMap<String,String> reJson() {
        HashMap<String,String> map = new HashMap<>();
        map.put("JAVA","NB");
        map.put("MYSQL","NB");
        map.put("SPRING","NB");
        return map;
    }

}
