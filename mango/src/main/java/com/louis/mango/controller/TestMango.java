package com.louis.mango.controller;

import com.louis.mango.model.SysUser;
import com.louis.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestMango {

    @Autowired
    private SysUserService service;

    @GetMapping("/test")
    public String test(){
        List<SysUser> result = service.findAll();
        return result.toString();

    }

}
