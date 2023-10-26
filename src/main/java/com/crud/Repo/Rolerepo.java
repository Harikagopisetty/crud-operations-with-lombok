package com.crud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Role;
import java.util.List;


public interface Rolerepo extends JpaRepository<Role,Integer> {
	public List<Role> findByType(String type);
}
