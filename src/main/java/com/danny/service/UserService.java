package com.danny.service;

import java.util.List;

import com.danny.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
