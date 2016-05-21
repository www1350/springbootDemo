package com.absurd.controller;

import com.absurd.dto.RetDTO;
import com.absurd.model.User;
import com.absurd.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * Created by Administrator on 2016/5/19.
 */
@ApiIgnore
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
    @RequestMapping(value = "/login")
    @ResponseBody
    public RetDTO login(@RequestParam String username, @RequestParam String password) {
        boolean islog = userService.login(username,password);
        RetDTO ret = new RetDTO();
        if(islog) {
            ret.setResCode(0);
            ret.setResMsg("登录成功!欢迎："+username);
        }
        else{
            ret.setResCode(-1);
            ret.setResMsg("登录失败");
        }
            return ret;
    }

    @RequestMapping("/register")
    @ResponseBody
    public RetDTO register(@RequestParam String username,@RequestParam String password) {
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        boolean isreg = userService.register(u);
        RetDTO ret = new RetDTO();
        if(isreg) {
            ret.setResCode(0);
            ret.setResMsg("注册成功!欢迎："+username);
        }
        else{
            ret.setResCode(-1);
            ret.setResMsg("注册失败");
        }
        return ret;

    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAll(){
       return userService.getAll();
    }

}
