package com.example.product.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈嘉欣
 * @date 2018/9/20 22:12
 **/
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is com.product msg 2";
    }
}
