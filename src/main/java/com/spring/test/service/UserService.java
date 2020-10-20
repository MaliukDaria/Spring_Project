package com.spring.test.service;

import com.spring.test.model.User;
import java.util.List;

public interface UserService {
    void add(User user);

    User get(Long id);

    List<User> listUsers();
}
