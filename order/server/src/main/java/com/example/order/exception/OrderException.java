package com.example.order.exception;

import com.example.order.enums.ResultEnum;

/**
 * @author 陈嘉欣
 * @date 2018/9/18 16:30
 **/
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
