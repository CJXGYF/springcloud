package com.example.order.VO;

import lombok.Data;

/**
 * @author 陈嘉欣
 * @date 2018/9/19 11:45
 **/
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
