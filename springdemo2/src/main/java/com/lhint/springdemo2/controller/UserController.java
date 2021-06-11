package com.lhint.springdemo2.controller;

import com.lhint.springdemo2.model.Registration;
import com.lhint.springdemo2.model.User;
import com.lhint.springdemo2.service.RegistrationServiceImpl;
import com.lhint.springdemo2.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.find(id);
    }

    @GetMapping("/users")
    public List<User> listAllUsers(){
        return userService.listAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable Integer userId){
        userService.delete(userId);
    }
}
