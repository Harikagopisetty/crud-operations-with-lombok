package com.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Repo.EmployeeRepo;
import com.crud.Repo.Rolerepo;
import com.crud.entity.Role;
@Service
public class RoleService {
@Autowired
private Rolerepo roleRepo;
	//private Rolerepo repo;
	//public Role addRole(Role role) {
	//	return repo.save(role);
	//}
	//public List<Role> getAll(){
	//	return repo.findAll();
	//}
@Autowired
private EmployeeRepo employeeRepo;
public Role addRole(Role role) {
	return roleRepo.save(role);
}
}
