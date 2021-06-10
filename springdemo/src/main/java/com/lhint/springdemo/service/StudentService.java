package com.lhint.springdemo.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

        public String sayHello(){
            System.out.println("Hello service");
            return "Hello Spring";
        }

}
