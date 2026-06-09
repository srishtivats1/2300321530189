package com.example.student_management.controller;

import com.example.student_management.entity.Student;
import com.example.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping
    public ResponseEntity<Student> saveStudent(
            @RequestBody Student student) {

        Student savedStudent = repository.save(student);


        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedStudent);
    }
}