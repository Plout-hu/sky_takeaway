package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

public interface UserService {
    /**
     * 微信登录
     * @param userLoginDTO 微信用户相关信息
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
