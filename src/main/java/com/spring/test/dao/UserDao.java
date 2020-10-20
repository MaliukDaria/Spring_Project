package com.spring.test.dao;

import com.spring.test.model.User;
import java.util.List;
import java.util.Optional;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    Optional<User> get(Long id);
}
