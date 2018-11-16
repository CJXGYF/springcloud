package com.example.order.utils;

import com.example.order.VO.ResultVO;

/**
 * @author 陈嘉欣
 * @date 2018/9/19 11:46
 **/
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
