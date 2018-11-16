package com.example.product.server.dto;

import lombok.Data;

/**
 * @author 陈嘉欣
 * @date 2018/9/24 16:20
 **/
@Data
public class CartDTO {

    /***
     * 商品ID
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
