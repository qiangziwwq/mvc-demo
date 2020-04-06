package com.wwq.mvc.dao.demo;

import com.wwq.mvc.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @description: TDDO
 * @author: wuweiqiang
 * @create: 2020/4/5
 * @version: 1.0
 */
public interface UserInfoMapper {
    /**
     * 根据ID获取单个对象
     * @param userId
     * @return
     */
    UserInfo selectOne(@Param("userId") Integer userId);

    int insertOne(UserInfo user);
}
