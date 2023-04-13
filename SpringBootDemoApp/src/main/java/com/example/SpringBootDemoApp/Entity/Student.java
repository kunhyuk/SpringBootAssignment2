package com.example.SpringBootDemoApp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_students")
public class Student {
    @Id
    @Column(name="s_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentID;
    private String studentName;
    private int age;
    private String description;
    public Student(){

    }

    public Student(int studentID, String studentName, int age, String description) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.description = description;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
