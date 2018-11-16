package com.example.user.server.impl;

import com.example.user.dataobject.UserInfo;
import com.example.user.repository.UserInfoRepository;
import com.example.user.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 陈嘉欣
 * @date 2018/11/9 1:06
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository repository;

    /**
     * 通过openid来查询用户信息
     *
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
