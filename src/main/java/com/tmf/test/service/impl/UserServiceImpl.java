package com.tmf.test.service.impl;

import com.tmf.test.mapper.UserMapper;
import com.tmf.test.model.User;
import com.tmf.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(User user) {
        int count = userMapper.login(user);
        if (count > 0) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }
}
