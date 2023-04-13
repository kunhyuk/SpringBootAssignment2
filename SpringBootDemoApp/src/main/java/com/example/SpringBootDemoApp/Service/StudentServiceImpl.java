package com.example.SpringBootDemoApp.Service;

import com.example.SpringBootDemoApp.Dao.StudentDao;
import com.example.SpringBootDemoApp.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> getAllStudents() {
        return this.studentDao.findAll();
    }

    @Override
    public Student getStudentByID(int studentID) {
        Optional <Student> p = this.studentDao.findById(studentID);
        Student student = null;
        if (p.isPresent()) {
            student = p.get();
        } else {
            throw new RuntimeException("Student not found for id: " + studentID);
        }
        return student;
    }

    @Override
    public Student addStudent(Student student) {
        return this.studentDao.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return this.studentDao.save(student);
    }

    @Override
    public String deleteStudentByID(int studentID) {
        this.studentDao.deleteById(studentID);
        return "DELETED STUDENT: " + studentID;
    }
}
