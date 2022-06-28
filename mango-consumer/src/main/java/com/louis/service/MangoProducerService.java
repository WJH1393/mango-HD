package com.louis.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="mango-producer",fallback = MangoProducerHystrix.class)
public interface MangoProducerService {
    @RequestMapping("/test")
    public String test();
}
