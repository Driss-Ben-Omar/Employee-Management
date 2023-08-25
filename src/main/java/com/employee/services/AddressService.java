package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.Address;
import com.employee.entities.Employee;
import com.employee.repositories.AddressRepository;
import com.employee.repositories.EmployeeRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	public void save(Address address) {
		addressRepository.save(address);
	}
	
	public List<Address> findAll(){
		return addressRepository.findAll();
	}
	
	public Address findById(Long id) {
		return addressRepository.findById(id).get();
	}
	
	public Address update(Address address) {
		return addressRepository.save(address);
	}
	
	public void delete(Address address) {
		addressRepository.delete(address);
	}
	
	public void deleteById(Long id) {
		addressRepository.deleteById(id);
	}
	
	public Employee findByAddress(Long id) {
		Address add=addressRepository.findById(id).get();
		return employeeRepository.findByAddress(add);
	}

}
