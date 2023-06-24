package com.example.app.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student dhruv = new Student(
                    "Dhruv",
                    "dhruv@gmail.com",
                    LocalDate.of(1998, Month.SEPTEMBER, 5));

            Student joe = new Student(
                    "Joe",
                    "joe@gmail.com",
                    LocalDate.of(1992, Month.SEPTEMBER, 5));

            repository.saveAll(List.of(dhruv, joe));
        };

    }
}
