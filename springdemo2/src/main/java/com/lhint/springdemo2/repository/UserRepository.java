package com.lhint.springdemo2.repository;

import com.lhint.springdemo2.model.User;

import java.util.List;

public interface UserRepository {

    void create(User user);

    User update(User user);

    User findById(Integer id);

    void delete(Integer id);

    List<User> listAll();

}
