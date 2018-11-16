package com.example.product.server.utils;

import com.example.product.server.VO.ResultVO;

/**
 * @author: 陈嘉欣
 * @date: 2018/9/13 17:33
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
