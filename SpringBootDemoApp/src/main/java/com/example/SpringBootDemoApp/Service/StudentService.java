package com.example.SpringBootDemoApp.Service;
import com.example.SpringBootDemoApp.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentByID(int studentID);
    Student addStudent(Student student);
    Student updateStudent(Student student);
    String deleteStudentByID(int studentID);
}
