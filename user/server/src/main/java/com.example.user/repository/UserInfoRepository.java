package com.example.user.repository;

import com.example.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 陈嘉欣
 * @date 2018/11/9 0:58
 **/
public interface UserInfoRepository extends JpaRepository<UserInfo,String> {

    /**
     *
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
