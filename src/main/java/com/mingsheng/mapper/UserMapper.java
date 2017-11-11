package com.mingsheng.mapper;


import com.mingsheng.model.User;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    public User findUserInfo();

    User getUserByPhone(Integer phone);

    Integer savaUser(User user);
}
