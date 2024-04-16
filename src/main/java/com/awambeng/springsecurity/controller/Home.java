package com.awambeng.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/")
    public String home(){
        return "<h1>Hey, Welcome...</h1>";
    }

    @RequestMapping("/user")
    public String getUserDetails(){
        return "<h1>Hello, welcome user...</h1>";
    }

    @RequestMapping("/admin")
    public String getAdminDetails(){
        return "<h1>Hello, welcome admin...</h1>";
    }
    
}
