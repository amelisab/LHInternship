package com.lhint.springdemo2.service;

import com.lhint.springdemo2.model.Course;

import java.util.List;

public interface CourseService {

    Course saveOrUpdate(Course course);

    void delete(Integer id);

    Course find(Integer id);

    List<Course> listAll();

}
