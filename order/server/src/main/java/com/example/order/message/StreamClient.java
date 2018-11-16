package com.example.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @author 陈嘉欣
 * @date 2018/11/7 12:52
 **/
@Component
public interface StreamClient {

    String INPUT = "myMessage";
    String INPUT2 = "myMessage2";

    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Input(StreamClient.INPUT2)
    SubscribableChannel input2();
}
