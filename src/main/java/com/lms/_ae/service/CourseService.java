package com.lms._ae.service;

import com.lms._ae.models.Course;
import com.lms._ae.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();
    Course getCourseById(Integer id);
    Course createCourse(Course course);
    Course updateCourse(Integer id, Course course);
    void deleteCourse(Integer id);

}
