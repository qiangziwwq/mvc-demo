package com.wwq.mvc.service.demo.impl;

import com.wwq.mvc.dao.demo.UserInfoMapper;
import com.wwq.mvc.entity.UserInfo;
import com.wwq.mvc.service.demo.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: TDDO
 * @author: wuweiqiang
 * @create: 2020/4/5
 * @version: 1.0
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public UserInfo queryUserInfoById(String uid) {
       return userInfoMapper.selectOne(Integer.valueOf(uid));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int saveUser(UserInfo info) {
        int result = 0;
        result= userInfoMapper.insertOne(info);
        /*if (result==1) {
            throw new RuntimeException("throw Exception");
        }*/

        return result;
    }
}
