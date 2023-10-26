package com.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Service.StudentService;
import com.crud.entity.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/addStud/{name}")
	public Student addStudent(@RequestBody Student student,@PathVariable(value="name") List<String> courseName){
	return studentService.addStudent(student,courseName);

}
}