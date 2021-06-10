package com.lhint.springdemo2.service;

import com.lhint.springdemo2.model.User;
import com.lhint.springdemo2.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepositoryImpl userRepository;

    @Override
    public User saveOrUpdate(User user) {
        return userRepository.update(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.delete(id);
    }

    @Override
    public User find(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> listAll() {
        return userRepository.listAll();
    }
}
