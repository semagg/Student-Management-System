package com.example.intership.controller;

import com.example.intership.model.Student;
import com.example.intership.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/studentAll")
    public List<Student> studentAll(){
        return studentService.studentAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        studentService.delete(id);
    }


}
