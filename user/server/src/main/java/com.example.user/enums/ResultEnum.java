package com.example.user.enums;

import lombok.Getter;

/**
 * @author 陈嘉欣
 * @date 2018/9/18 16:34
 **/
@Getter
public enum ResultEnum {

    /**
     *
     */
    LOGIN_FAIL(1, "登录失败"),
    ROLE_ERROR(2, "角色权限有误");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
