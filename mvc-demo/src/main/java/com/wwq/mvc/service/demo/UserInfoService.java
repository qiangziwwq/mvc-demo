package com.wwq.mvc.service.demo;

import com.wwq.mvc.entity.UserInfo;

/**
 * @description: TDDO
 * @author: wuweiqiang
 * @create: 2020/4/5
 * @version: 1.0
 */
public interface UserInfoService {

    UserInfo queryUserInfoById(String uid);

    int saveUser(UserInfo info);
}
