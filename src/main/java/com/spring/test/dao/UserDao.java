package com.spring.test.dao;

import com.spring.test.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
