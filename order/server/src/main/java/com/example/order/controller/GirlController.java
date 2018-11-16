package com.example.order.controller;

import com.example.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈嘉欣
 * @date 2018/10/7 17:37
 **/
@RestController
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/girl/print")
    private String print(){
        return "name:" + girlConfig.getName() + " age:" + girlConfig.getAge();
    }
}
