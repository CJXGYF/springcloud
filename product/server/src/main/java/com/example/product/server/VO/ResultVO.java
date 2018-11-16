package com.example.product.server.VO;

import lombok.Data;

/**
 * @author: 陈嘉欣
 * @date: 2018/9/13 14:55
 */
@Data
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;
    
}
