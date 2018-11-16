package com.example.user.enums;

import lombok.Getter;

/**
 * @author 陈嘉欣
 * @date 2018/11/9 14:13
 **/
@Getter
public enum RoleEnum {

    /**
     *
     */
    BUYER(1, "买家"),
    SELLER(2, "卖家"),
    ;

    private Integer code;

    private String message;

    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
