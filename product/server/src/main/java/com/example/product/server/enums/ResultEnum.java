package com.example.product.server.enums;

import lombok.Getter;

/**
 * @author 陈嘉欣
 * @date 2018/9/24 16:57
 **/
@Getter
public enum ResultEnum {

    /**
     * 商品不存在
     */
    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PROODUCT_STOCK_ERROR(2,"库存有误");

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
