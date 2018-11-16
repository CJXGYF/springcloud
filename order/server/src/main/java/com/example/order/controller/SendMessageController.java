package com.example.order.controller;

import com.example.order.dto.OrderDTO;
import com.example.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈嘉欣
 * @date 2018/11/7 12:57
 **/
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

//    @GetMapping("/sendMessage")
//    public void process(){
//        String message = "now " + new Date();
//        streamClient.input().send(MessageBuilder.withPayload(message).build());
//    }

    /**
     * 发送orderDTO对象
     */
    @GetMapping("/sendMessage")
    public void process(){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("123456");
        streamClient.input().send(MessageBuilder.withPayload(orderDTO).build());
    }
}
