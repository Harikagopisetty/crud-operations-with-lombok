package com.crud.Controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Service.RoleService;
import com.crud.entity.Role;
@RestController
public class RoleController {
	@Autowired
	private RoleService roleService;

	//@PostMapping("/saveRole")
	//public Role addRole(@RequestBody Role role) {
		//return  roleService.addRole(role);
	//}

	//@GetMapping("/allRoles")
	//public List<Role> getAll(){
		//return roleService.getAll();
	//}
	@PostMapping("/addRole")
	public Role addRole(@RequestBody Role role) {
		return roleService.addRole(role);
	}
}
