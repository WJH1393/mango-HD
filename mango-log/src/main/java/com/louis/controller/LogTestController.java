package com.louis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    @RequestMapping("/testLog")
    public String testLog(){
        log.info("info日志测试66666");
        log.error("error错误日志打印测试！");
        log.trace("trace日志打印测试！");
        log.warn("warn日志打印测试！");
        log.debug("debugger日志打印测试");
        return "this is my log test !";
    }
}
