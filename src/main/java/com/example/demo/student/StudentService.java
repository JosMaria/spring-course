package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Jose Maria", "josmariguilar@gmail.com",
                        LocalDate.of(1998, Month.JANUARY, 17), 23),

                new Student(2L, "Darleen", "darlinchis@gmail.com",
                        LocalDate.of(2003, Month.AUGUST, 3), 17)
        );
    }
}
