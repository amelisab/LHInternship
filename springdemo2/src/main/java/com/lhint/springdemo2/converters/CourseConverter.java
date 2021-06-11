package com.lhint.springdemo2.converters;

import com.lhint.springdemo2.model.Course;
import com.lhint.springdemo2.model.Registration;
import com.lhint.springdemo2.response.CourseResponse;
import com.lhint.springdemo2.response.RegistrationResponse;

import java.util.ArrayList;
import java.util.List;

public class CourseConverter {

    private static RegistrationConverter registrationConverter = new RegistrationConverter();

    public CourseResponse convert(Course course){
        CourseResponse response = new CourseResponse();

        response.setId(course.getId());
        response.setDescription(course.getDescription());
        response.setName(course.getName());
        response.setRegistrations(registrationConverter.convert(course.getRegistrations()));

        return response;
    }

//    public Course reverseConvert(CourseResponse response){
//        Course course = new Course();
//
//    }
}
