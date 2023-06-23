package com.example.app.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}

//return List.of(
//        new Student(
//        1L,
//        "Dhruv",
//        "dhruv@gmail.com",
//        LocalDate.of(1998, Month.SEPTEMBER, 5),
//        24));
