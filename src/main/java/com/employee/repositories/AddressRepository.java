package com.employee.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.employee.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
	
	
}
