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

import com.employee.entities.Departement;
import com.employee.entities.Employee;
import com.employee.services.DepartmentService;

@RestController
public class DepartementController {
	
	@Autowired
	DepartmentService departmentService;
	
	
	@GetMapping("departement")
	public List<Departement> findAll(){
		return departmentService.findAll();
	}
	
	@GetMapping("departement/{id}")
	public Departement findById(@PathVariable Long id) {
		return departmentService.findById(id);
	}
	
	@PostMapping("departement")
	public void save(@RequestBody Departement departement) {
		departmentService.save(departement);
	}
	
	@PutMapping("department")
	public void update(@RequestBody Departement departement) {
		departmentService.update(departement);
	}
	
	@DeleteMapping("department")
	public void delete(@RequestBody Departement departement) {
		departmentService.delete(departement);
	}
	
	@DeleteMapping("department/{id}")
	public void deleteById(@PathVariable Long id) {
		departmentService.deleteById(id);
	}
	
	@GetMapping("department/{id}/employees")
	public List<Employee> findEmplyesByDepartment(@PathVariable Long id){
		return departmentService.findEmplyesByDepartment(id);
	}

}
