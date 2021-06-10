package com.lhint.springdemo2.service;

import com.lhint.springdemo2.model.User;

import java.util.List;

public interface UserService {

    User saveOrUpdate(User user);

    void delete(Integer id);

    User find(Integer id);

    List<User> listAll();

}
