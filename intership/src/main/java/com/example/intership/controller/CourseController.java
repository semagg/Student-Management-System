package com.example.intership.controller;

import com.example.intership.model.Course;
import com.example.intership.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/save")
    public Course save(@RequestBody Course course){
        return courseService.save(course);
    }

    @GetMapping("/courseAll")
    public List<Course> courseAll(){
        return courseService.courseAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        courseService.delete(id);
    }
}
