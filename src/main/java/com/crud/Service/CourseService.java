package com.crud.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Repo.CourseRepo;
import com.crud.Repo.StudentRepo;
import com.crud.entity.Course;
import com.crud.entity.Student;

@Service
public class CourseService {
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private CourseRepo courseRepo;
	/*
	 * public Course addCourse(Course course,String name) { Student
	 * student1=studentRepo.findBynameIn(name); List<Student> students=new
	 * ArrayList<>(); students.add(student1); course.setStudents(students);
	 * 
	 * 
	 * return courseRepo.save(course); }
	 */
	}

