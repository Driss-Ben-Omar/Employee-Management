package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.Departement;
import com.employee.entities.Employee;
import com.employee.repositories.DepartementRepository;
import com.employee.repositories.EmployeeRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartementRepository departementRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Departement> findAll(){
		return departementRepository.findAll();
	}
	
	public Departement findById(Long id) {
		return departementRepository.findById(id).get();
	}
	
	public void save(Departement departement) {
		departementRepository.save(departement);
	}
	
	public void update(Departement departement) {
		departementRepository.save(departement);
	}
	
	public void delete(Departement departement) {
		departementRepository.delete(departement);
	}
		
	public void deleteById(Long id) {
		departementRepository.deleteById(id);
	}
	
	public List<Employee> findEmplyesByDepartment(Long id){
		Departement departement=departementRepository.findById(id).get();
		return employeeRepository.findByDepartement(departement);
	}

}
