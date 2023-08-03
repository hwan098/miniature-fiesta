package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private int studentId;
    private String lastName;

    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(
            1,
            "Changhwan",
            "Choi"
        );
        return student;
    }
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Changhwan", "Choi"));
        students.add(new Student(2, "Changhwan", "kim"));
        students.add(new Student(3, "Changhwan", "lee"));
        students.add(new Student(4, "Changhwan", "park"));
        return students;
    }

    //Spring Boot REST API with path Variable
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){
        this.studentId = studentId;
        this.lastName = lastName;
        return new Student(studentId, firstName, lastName);
    }
}
