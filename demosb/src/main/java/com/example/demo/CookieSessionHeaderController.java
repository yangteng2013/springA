package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequestMapping("/csh")
@Controller
@Slf4j
public class CookieSessionHeaderController {

    @RequestMapping("/getCookie")
    @ResponseBody
    public String getCookie(HttpServletRequest request, HttpServletResponse response){
        String name=  request.getParameter("name");
        Cookie[] cookies = request.getCookies();
        String userAgent = request.getHeader("User-Agent");
        return name +" 你好" +userAgent;
    }

    @RequestMapping("/cookie")
    @ResponseBody
    public String cookie(@CookieValue("bite") String bite){
        return "cookie:"+bite;
    }
    @RequestMapping("/header")
    @ResponseBody
    public String header(@RequestHeader("User-Agent") String userAgent){
        return "userAgent:"+userAgent;
    }

    /**
     * http://localhost:9090/csh/setSession
     * @param request
     * @return
     */
    @RequestMapping("/setSession")
    @ResponseBody
    public String setSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        if (session!=null) {
            session.setAttribute("username","Yangt");
        }
        return "session 存储成功";
    }

    /**
     * http://localhost:9090/csh/getSession
     * @param request
     * @return
     */
    @RequestMapping("/getSession")
    @ResponseBody
    public String getSession(HttpServletRequest request){
       HttpSession session = request.getSession(false);
        String username;
        if (session!=null) {
            username = (String) session.getAttribute("username");
        }else {
            username="none";
        }
        return "username: "+username;
    }

    /**
     * http://localhost:9090/csh/getSession2
     * @param username
     * @return
     */
    @RequestMapping("/getSession2")
    @ResponseBody
    public String getSessionBySimple(@SessionAttribute("username")String username){
        return "username2: "+username;
    }

}

