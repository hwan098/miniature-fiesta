package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    //Spring Boot REST API with Request param

    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        return new Student(id, firstName, lastName);
    }

    //Spring Boot REST API that handles HTTP POST Request
    //@PostMapping and @RequestBody
    @PostMapping("students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    //Spring Boot REST API that handles HTTP PUT Request - updating existing resource
    @PutMapping("students/{id}/update")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") int studentId){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    //Spring Boot REST API that handles HTTP DELETE Request - deleting the existing resource
    @DeleteMapping("students/{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return "Student deleted successfully!";
    }
}
