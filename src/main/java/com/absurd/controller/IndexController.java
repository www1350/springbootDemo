package com.absurd.controller;

import com.absurd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/5/19.
 */
@RestController
@EnableAutoConfiguration
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam String username,@RequestParam String password) {
        boolean islog = userService.login(username,password);
        if(islog)
        return "登录成功!欢迎："+username;
        else
            return "登录失败";
    }
}
