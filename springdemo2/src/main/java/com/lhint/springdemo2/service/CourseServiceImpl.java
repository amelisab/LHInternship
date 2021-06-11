package com.lhint.springdemo2.service;

import com.lhint.springdemo2.converters.CourseConverter;
import com.lhint.springdemo2.model.Course;
import com.lhint.springdemo2.repository.CourseRepository;
import com.lhint.springdemo2.repository.CourseRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepositoryImpl courseRepository;

    @Override
    public Course saveOrUpdate(Course course) {
        return courseRepository.update(course);
    }

    @Override
    public void delete(Integer id) {
        courseRepository.delete(id);
    }

    @Override
    public Course find(Integer id) {
        return courseRepository.findById(id);
    }

    @Override
    public List<Course> listAll() {
        return courseRepository.listAll();
    }
}
