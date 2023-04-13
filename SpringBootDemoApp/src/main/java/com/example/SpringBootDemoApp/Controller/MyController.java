package com.example.SpringBootDemoApp.Controller;

import com.example.SpringBootDemoApp.Entity.Student;
import com.example.SpringBootDemoApp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MyController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/")
    public String home() {
        return "<HTML><H3>Welcome to homepage you can add, edit, and delete students' information here! </H3></HTML>";
    }
    @GetMapping("/students")
    public List<Student> getsStudents() {
        return this.studentService.getAllStudents();
    }
    @GetMapping("/students/{studentID}")
    public Student getStudent(@PathVariable String studentID) {
        return this.studentService.getStudentByID(Integer.parseInt(studentID));
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return this.studentService.addStudent(student);
    }
    @DeleteMapping("/students/{studentID}")
    public String deleteStudent(@PathVariable String studentID) {
        return this.studentService.deleteStudentByID(Integer.parseInt(studentID));
    }
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return this.studentService.updateStudent(student);
    }

}
