package com.crina.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/*")
    public String getHomepage(){
        return "Hello world";
    }
}
