package com.louis.controller;

import com.louis.service.MangoProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerTest {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    MangoProducerService mangoProducerService;

    //获取所有上午服务
    @RequestMapping("/services")
    public Object services(){
        return discoveryClient.getInstances("mango-producer");
    }
    //从所有服务中选择一个服务
    @RequestMapping("discover")
    public Object discover(){
        return loadBalancerClient.choose("mango-producer").getUri().toString();
    }

    /***
     * 远程调用第三方的方法
     * @return
     */
    @RequestMapping("/call")
    public String test(){
        //获取提供方服务
        ServiceInstance service = loadBalancerClient.choose("mango-producer");
        String result = new RestTemplate().getForObject(service.getUri().toString()+"/test",String.class);
        System.out.println("结果："+result);
        return result;
    }

    @RequestMapping("call2")
    public String test1(){
        return mangoProducerService.test();
    }

}
