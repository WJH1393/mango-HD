package com.louis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
    @RequestMapping("/testLog")
    public String testLog(){
        return "this is my log test !";
    }
}
