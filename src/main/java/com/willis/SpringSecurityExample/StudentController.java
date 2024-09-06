package com.willis.SpringSecurityExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>(List.of(
            new Student(1,"otondi",70),
            new Student(2,"willis",50)
    ));
    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

}
