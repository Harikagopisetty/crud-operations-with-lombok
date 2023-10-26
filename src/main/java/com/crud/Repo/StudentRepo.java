package com.crud.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
//public Student findBynameIn(List<String> name);
}
