package com.work.luckymoney.controller;

import com.work.luckymoney.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Config config;
    @GetMapping("/hello/say")
    public String say() {
        return "江神无敌" ;}

    @GetMapping("/abc")
    public int say2() {
        return 2;
    }

    @GetMapping("/123")
    public boolean abc() {
        return true;
    }


}
