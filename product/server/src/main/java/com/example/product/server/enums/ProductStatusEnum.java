package com.example.product.server.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 *
 * @author: 陈嘉欣
 * @date: 2018/9/13 13:47
 */
@Getter
public enum ProductStatusEnum {

    /**
     * 在架
     */
    UP(0, "在架"),
    /**
     * 下架
     */
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
