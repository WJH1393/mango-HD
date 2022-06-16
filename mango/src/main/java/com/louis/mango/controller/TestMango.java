package com.louis.mango.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMango {

    @RequestMapping("/test")
    public String test(){

        return "基本服务搭建成功！";

    }

}
