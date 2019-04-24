package com.example.shao.controller;

import com.example.shao.entity.MyProperties;
import com.example.shao.entity.MyProperties2;
import com.example.shao.entity.MyRandom;
import com.example.shao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello world";

    }

    @RequestMapping("/getUser")
    public User getUser(HttpServletRequest request){
        User user = new User();
        user.setUsername("小明");
        user.setPassword("xxx");
        return user;
    }

    //通过AutoWired完成自动装配
    @Autowired
    MyProperties properties= new MyProperties();
    @RequestMapping("/getMyProperties")
    public MyProperties getMyProperties() {
        return properties;
    }

    @Autowired
    MyProperties2 properties2 = new MyProperties2();

    @RequestMapping("/getMyProperties2")
    public MyProperties2 getProperties2(){

        return properties2;
    }

    @Autowired
    MyRandom myRandom = new MyRandom();

    @RequestMapping("/getMyRandom")
    public MyRandom getMyRandom(){

        return myRandom;
    }
}
