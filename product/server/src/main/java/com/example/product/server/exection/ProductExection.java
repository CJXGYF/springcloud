package com.example.product.server.exection;

import com.example.product.server.enums.ResultEnum;

/**
 * @author 陈嘉欣
 * @date 2018/9/24 16:52
 **/
public class ProductExection extends RuntimeException {

    private Integer code;

    public ProductExection(Integer code, String message){
        super(message);
        this.code = code;
    }

    public ProductExection(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
