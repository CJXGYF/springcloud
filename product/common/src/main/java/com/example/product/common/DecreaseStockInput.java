package com.example.product.common;

import lombok.Data;

/**
 * @author 陈嘉欣
 * @date 2018/9/27 21:08
 **/
@Data
public class DecreaseStockInput {
    /***
     * 商品ID
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
