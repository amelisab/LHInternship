package com.lhint.springdemo2.controller;

import com.lhint.springdemo2.converters.CourseConverter;
import com.lhint.springdemo2.model.Course;
import com.lhint.springdemo2.model.Registration;
import com.lhint.springdemo2.response.CourseResponse;
import com.lhint.springdemo2.service.CourseServiceImpl;
import com.lhint.springdemo2.service.RegistrationService;
import com.lhint.springdemo2.service.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
// RespBody serializes the fetched object fields into JSON and returns to the client that requested it.
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;

    @Autowired
    private RegistrationServiceImpl registrationService;

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable Integer id){
        return courseService.find(id);
    }

    @GetMapping("/courses")
    public List<Course> listAllCourses(){
        return courseService.listAll();
    }

    @PostMapping("/registrations/{registrationId}/courses")
    public Course createCourse(@PathVariable Integer registrationId,
                               @RequestBody Course course) {
        course.setRegistrations(registrationService.find(registrationId));
        return courseService.saveOrUpdate(course);
    }

    @DeleteMapping("registrations/{registrationId}/courses/{courseId}")
    public void deleteCourse(@PathVariable Integer courseId,
                             @PathVariable Integer registrationId){

        Registration registration = registrationService.find(registrationId);
		List<Course> courses = registration.getCourses();

		Course courseToBeRemoved = null;

		for(Course c: courses){
			if(c.getId() == courseId){
				courseToBeRemoved = c;
				break;
			}
		}
		courses.remove(courseToBeRemoved);

		registration.setCourses(courses);
		registrationService.saveOrUpdate(registration);
    }



}
