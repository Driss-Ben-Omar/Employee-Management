package com.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entities.Address;
import com.employee.entities.Employee;
import com.employee.services.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addressService;
	

	@PostMapping("address")
	public void save(@RequestBody Address address) {
		addressService.save(address);
	}
	
	@GetMapping("address")
	public List<Address> findAll(){
		return addressService.findAll();
	}
	
	@GetMapping("address/{id}")
	public Address findById(@PathVariable Long id) {
		return addressService.findById(id);
	}
	
	@PutMapping("address")
	public Address update(@RequestBody Address address) {
		return addressService.update(address);
	}
	
	@DeleteMapping("address")
	public void delete(@RequestBody Address address) {
		addressService.delete(address);
	}
	
	@DeleteMapping("address/{id}")
	public void deleteById(@PathVariable Long id) {
		addressService.deleteById(id);
	}
	
	@GetMapping("address/{id}/employee")
	public Employee findByAddress(@PathVariable Long id) {
		return addressService.findByAddress(id);
	}
}
