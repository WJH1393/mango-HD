package com.louis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    @RequestMapping("/testLog")
    public String testLog(){
        log.info("日志测试66666");
        return "this is my log test !";
    }
}
