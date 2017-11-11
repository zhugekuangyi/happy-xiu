package com.mingsheng.service;

import com.mingsheng.mapper.UserMapper;
import com.mingsheng.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserByPhone(Integer phone) {
        User user = userMapper.getUserByPhone(phone);
        return user;
    }

    public Integer savaUser(User user) {
        Integer integer = userMapper.savaUser(user);
        return integer;
    }

}
