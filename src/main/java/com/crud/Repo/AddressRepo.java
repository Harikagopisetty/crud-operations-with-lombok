package com.crud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
