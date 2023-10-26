package com.crud.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Employee;

	public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

		public List<Employee> findByName(String name);
		public List<Employee> findByOrderByNameDesc();
		public List<Employee> findByOrderByName();
		public List<Employee> findByNameStartingWith(String Name);
	    public List<Employee> findByNameContaining(String name);
		public List<Employee> findByNameNotContaining(String name);
	}

