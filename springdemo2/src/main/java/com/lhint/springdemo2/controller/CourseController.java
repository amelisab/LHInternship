package com.lhint.springdemo2.controller;

import com.lhint.springdemo2.model.Course;
import com.lhint.springdemo2.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
// RespBody serializes the fetched object fields into JSON and returns to the client that requested it.
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Integer id){
        return courseService.find(id);
    }

}
