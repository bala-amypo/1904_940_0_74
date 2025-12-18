package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {
    Student saveStudent(Student st);
    Student getAllStudents(Student st);
}
