package com.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Service.EmployeeService;
import com.crud.entity.Employee;

import jakarta.validation.Valid;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService  employeeService;
	
@PostMapping("/addEmp")
public Employee addEMplEmployee( @Valid @RequestBody Employee employee) {
	return employeeService.addEmployee(employee);		
}

@PutMapping("/updateEmp")
public Employee updateEmployee(@RequestBody Employee employee) {
	return employeeService.updateEmployee( employee);
}
@DeleteMapping("/deleteEmp/{id}")
public String deleteEmployee(@PathVariable(value="id") int id) {
	 employeeService.deleteEmployee( id);
	 return "employee deleted successfully";
}
@GetMapping("/getEmp")
public List<Employee> get(){
	
	return employeeService.getAllStudents();
}
	@GetMapping("/getByName/{name}")
	public List<Employee> getByName(@PathVariable(value="name") String name) 
	{
		return employeeService.getEmployeeByName(name);
	}
	@GetMapping("/orderByName")

		public List<Employee> orderByName(){
		return employeeService.orderByName();
	}
	@GetMapping("/orderByNameAsc")

	public List<Employee> orderByNameAsc(){
	return employeeService.orderByNameAsc();
}	
	@GetMapping("/startsWith/{name}")
	public List<Employee> startsWith(@PathVariable(value="name") String name)
	{
	return employeeService.startsWith(name);	
}
	@GetMapping("/Containing/{name}")
	public List<Employee> containing(@PathVariable(value="name") String name){
		return employeeService.Containing(name);
	}
	@GetMapping("/notContaining/{name}")
	public List<Employee> notContaining(@PathVariable (value = "name") String name){
		return employeeService.notContaining(name);
	} 
}






