package com.louis.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class MangoProducerHystrix implements MangoProducerService{
    @Override
    @RequestMapping("/test")
    public String test() {
        return "sorry,hell service call failed !";
    }
}
