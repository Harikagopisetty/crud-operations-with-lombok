package com.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Repo.AddressRepo;
import com.crud.entity.Address;
import com.crud.entity.Employee;

@RestController
public class AddressController {
	@Autowired
	private AddressRepo addressRepo;
	
	
	@PostMapping("/addAddress")
	public Address addAddress() {
       Address address= new Address();
       address.setCity("hyd");
       address.setState("ts");
       Employee employee=new Employee();
       employee.setName("harika");
       employee.setRoll(1);
       employee.setSalary(12345);
       employee.setAddress(address);
       address.setEmployee(employee);
		
		
		return addressRepo.save(address);
	}

	@GetMapping("/allAdress")
	public List<Address> getAllAdress() {
		return addressRepo.findAll();
	}
	@DeleteMapping("/del/{id}")
	public String deleteById(@PathVariable(value = "id") int id ) {
		
		 addressRepo.deleteById(id);
		return "deleted successfully";
	}

}
	


