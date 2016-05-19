package com.absurd.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/5/19.
 */
@RestController
@EnableAutoConfiguration
public class IndexController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
