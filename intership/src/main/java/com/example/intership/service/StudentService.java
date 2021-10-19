package com.example.intership.service;

import com.example.intership.model.Student;
import com.example.intership.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student save(Student student){

        return studentRepository.save(student);
    }

    public void delete(Long id){
         studentRepository.deleteById(id);
    }

    public List<Student> studentAll(){
        return studentRepository.findAll();
    }


}
