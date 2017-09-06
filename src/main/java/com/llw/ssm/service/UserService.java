package com.llw.ssm.service;

import com.llw.ssm.model.User;
import com.llw.ssm.common.PageInfo;

import java.util.List;

public interface UserService {
    void findUser(PageInfo pageInfo, User user);

    void createUser(User user);

    void deleteUser(User user);

    void batchDeleteUser(List<Integer> userIds);

    void updateUser(User user);
}
