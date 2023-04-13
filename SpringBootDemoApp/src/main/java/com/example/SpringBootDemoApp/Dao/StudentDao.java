package com.example.SpringBootDemoApp.Dao;

import com.example.SpringBootDemoApp.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {
}
