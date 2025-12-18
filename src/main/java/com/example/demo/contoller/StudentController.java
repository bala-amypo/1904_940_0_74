package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired
    StudentService studentService;
    
    @PostMapping("/postdata")
    public Student postdata(@RequestBody Student stu){
        return studentService.saveStudent(stu);
    }

    @GetMapping("/getdata")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}