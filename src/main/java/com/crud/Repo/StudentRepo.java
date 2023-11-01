package com.crud.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Student;

import jakarta.validation.Valid;

public interface StudentRepo extends JpaRepository<Student, Integer> {
 Student findBynameIn(List<String> name);
 Optional<Student> findById(int id);
}
