package com.example.order.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author 陈嘉欣
 * @date 2018/9/18 16:21
 **/
@Data
public class OrderForm {

    @NotEmpty(message = "姓名必填")
    private String name;
    @NotEmpty(message = "手机号必填")
    private String phone;
    @NotEmpty(message = "地址必填")
    private String address;
    @NotEmpty(message = "openId必填")
    private String openid;
    @NotEmpty(message = "购物车不能为空")
    private String items;

}
