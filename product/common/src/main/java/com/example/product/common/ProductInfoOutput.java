package com.example.product.common;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 陈嘉欣
 * @date 2018/9/27 21:05
 **/
@Data
public class ProductInfoOutput {
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}
