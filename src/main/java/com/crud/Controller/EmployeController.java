package com.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Repo.EmployeRepo;
import com.crud.Repo.ProjectRepo;
import com.crud.entity.Employe;
import com.crud.entity.Project;

@RestController
public class EmployeController {
	@Autowired
	private EmployeRepo  employeRepo;
	@Autowired 
	private ProjectRepo projectRepo;
	
@GetMapping("/getallemploye")
public List<Employe> getAllEmployes(){
	return employeRepo.findAll();
}
	
@PostMapping("/addEmploye")
public Employe addEmploye(@RequestBody Employe employe) {
	return employeRepo.save(employe);		
}
@PostMapping("addEmploye/{id}")
public List<Employe> addEmploye(@RequestBody Employe employe,@PathVariable(value="id")int id) {
	Project project=projectRepo.findById(id).get();
	employe.setProject(project);
 employeRepo.save(employe);
 return employeRepo.findAll();
}
}