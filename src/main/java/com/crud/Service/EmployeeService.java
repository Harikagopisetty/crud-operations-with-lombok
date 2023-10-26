package com.crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Employee;
import com.crud.Repo.EmployeeRepo;
@Service
public class EmployeeService {
@Autowired	
 private EmployeeRepo employeeRepo;
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	public Employee updateEmployee(Employee empl) {
		Optional<Employee> optional = employeeRepo.findById(empl.getId());
		if (optional.get()==null) {
			
			throw new ArithmeticException("id is not present");
		}
    
	
		return employeeRepo.save(empl);
	}
	public void deleteEmployee(int id) {
		Optional<Employee> optional = employeeRepo.findById(id);	
		if (optional.get()==null) {
			
			throw new ArithmeticException("id is not present");
		}
	employeeRepo.deleteById(id);
	}
	public List<Employee> getAllStudents() {
	  return employeeRepo.findAll();
	}
public List<Employee> getEmployeeByName(String name)
{
	return employeeRepo.findByName(name);
}
public List<Employee> orderByName()
{
	return employeeRepo.findByOrderByName();
	}
public List<Employee> orderByNameAsc()
{
	return employeeRepo.findByOrderByName();
	}
public List<Employee> startsWith(String name){
	return employeeRepo.findByNameStartingWith(name);
}
public List<Employee> Containing(String name){
	return employeeRepo.findByNameContaining(name);
}
public List<Employee> notContaining(String name){
	return employeeRepo.findByNameNotContaining(name);
}

}

