package com.example.user.server;

import com.example.user.dataobject.UserInfo;

/**
 * @author 陈嘉欣
 * @date 2018/11/9 1:02
 **/
public interface UserService {

    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
