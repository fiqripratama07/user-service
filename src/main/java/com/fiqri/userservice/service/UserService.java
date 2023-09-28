package com.fiqri.userservice.service;

import com.fiqri.userservice.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(String id);

    List<User> getAllUser();

    User updateUser(User user);

    void deleteUser(String id);
}
