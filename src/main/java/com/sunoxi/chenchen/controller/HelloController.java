package com.sunoxi.chenchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunoxi on 2018/7/4.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String helloworld (){
        return "Hello World!";
    }
}
