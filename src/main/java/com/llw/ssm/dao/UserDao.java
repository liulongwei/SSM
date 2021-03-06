package com.llw.ssm.dao;

import com.llw.ssm.model.User;

import java.util.List;

public interface UserDao {
    List<User> findUserByParams(User user);
    void createUser(User user);
    void deleteUser(User user);
    void batchDeleteUser(List<Integer> userIds);
    void updateUser(User user);
}
