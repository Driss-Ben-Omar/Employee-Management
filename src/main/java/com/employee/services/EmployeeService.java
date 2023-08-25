package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.Employee;
import com.employee.entities.EmployeeRole;
import com.employee.entities.Mission;
import com.employee.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public void save(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	public Employee findById(Long id) {
		return employeeRepository.findById(id).get();
	}

	public Employee findByEmail(String email) {
		return employeeRepository.findByEmail(email);
	}

	public List<Employee> findByFirstName(String firstName) {

		return employeeRepository.findByFirstName(firstName);
	}

	public List<Employee> findByLastName(String lastName) {

		return employeeRepository.findByLastName(lastName);
	}
	
	public List<Employee> findByRole(EmployeeRole role){
		return employeeRepository.findByRole(role);
	}
	
	public void addMissionToEmployee(Long id,List<Mission> missions) {
		Employee employee=employeeRepository.findById(id).get();
		employee.setMissions(missions);
		employeeRepository.save(employee);
	}

//	public List<Mission> findMissionsByEmployee(Long id){
//		Employee employee=employeeRepository.findById(id).get();
//		return employee.getMissions();
//	}
		
	public void remove(Employee employee) {
		employeeRepository.delete(employee);
	}
	
	public void removeById(Long id) {
		employeeRepository.deleteById(id);
	}
	
	public Employee update(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Long count(){
		return employeeRepository.countAllEmployee();
	}
	
}
