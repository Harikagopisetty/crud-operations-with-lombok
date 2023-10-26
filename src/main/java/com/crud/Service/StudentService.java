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
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private CourseRepo courseRepo;

	public Student addStudent(Student student, List<String> name) {
		List<Course> course1 = courseRepo.findByCoursenameIn(name);
		
		student.setCourses(course1);

		return studentRepo.save(student);
	}
}
