package com.lhint.springdemo2.repository;

import com.lhint.springdemo2.model.Course;

import java.util.List;

public interface CourseRepository {

    void create(Course course);

    Course update(Course course);

    Course findById(Integer id);

    void delete(Integer id);

    List<Course> listAll();
}
