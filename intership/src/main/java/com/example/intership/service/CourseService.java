package com.example.intership.service;

import com.example.intership.model.Course;
import com.example.intership.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course save(Course course){
        return courseRepository.save(course);
    }

    public List<Course> courseAll(){
        return courseRepository.findAll();
    }

    public void delete(Long id){
        courseRepository.deleteById(id);
    }
}
