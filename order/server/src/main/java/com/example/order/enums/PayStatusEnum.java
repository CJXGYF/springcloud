package com.example.order.enums;

import lombok.Getter;

/**
 * @author: 陈嘉欣
 * @date: 2018/9/13 20:53
 */
@Getter
public enum  PayStatusEnum {
    /**
     * 新订单
     */
    WAIT(0,"等待支付"),
    /**
     * 完结
     */
    SUCCESS(1,"支付成功");

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
