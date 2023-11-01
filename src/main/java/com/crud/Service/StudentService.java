package com.crud.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.Repo.CourseRepo;
import com.crud.Repo.StudentRepo;
import com.crud.entity.Course;
import com.crud.entity.Student;

import jakarta.validation.Valid;

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
	
	/*public Student updateStudent( Student student,Integer id) throws AccountNotFoundException {
		Optional<Student> student1=studentRepo.findById(id);
		student1.orElseThrow(()->new AccountNotFoundException("not found:"+id));
		
		return  studentRepo.save(student);
	}*/
}
