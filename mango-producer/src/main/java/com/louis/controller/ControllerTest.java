package com.louis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @RequestMapping("/test1")
    public String test(){
        return "this is producer1 !";
    }
}
