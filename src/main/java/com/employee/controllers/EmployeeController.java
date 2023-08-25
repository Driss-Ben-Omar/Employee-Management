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

import com.employee.entities.Employee;
import com.employee.entities.EmployeeRole;
import com.employee.entities.Mission;
import com.employee.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("employee")
	public void save(@RequestBody Employee employee) {
		employeeService.save(employee);
	}
	
	@PostMapping("employee/{id}/missions")
	public void addMissionToEmployee(@PathVariable Long id,@RequestBody List<Mission> missions)
	{
		employeeService.addMissionToEmployee(id, missions);
	}
	
	@GetMapping("employee")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@GetMapping("employee/{id}")
	public Employee findById(@PathVariable Long id) {
		return employeeService.findById(id);
	}

	@GetMapping("employee/email={email}")
	public Employee findByEmail(@PathVariable String email) {
		return employeeService.findByEmail(email);
	}

	@GetMapping("employee/firstname={firstName}")
	public List<Employee> findByFirstName(@PathVariable String firstName) {

		return employeeService.findByFirstName(firstName);
	}

	@GetMapping("employee/lastname={lastName}")
	public List<Employee> findByLastName(@PathVariable String lastName) {

		return employeeService.findByLastName(lastName);
	}
	
	@GetMapping("employee/role={role}")
	public List<Employee> findByRole(@PathVariable EmployeeRole role){
		return employeeService.findByRole(role);
	}
	
//	@GetMapping("employee/{id}/missions")
//	public List<Mission> findMissionsByEmployee(@PathVariable Long id){
//		return employeeService.findMissionsByEmployee(id);
//	}
		
	@DeleteMapping("employee")
	public void remove(@RequestBody Employee employee) {
		employeeService.remove(employee);
	}
	
	@DeleteMapping("employee/{id}")
	public void removeById(@PathVariable Long id) {
		employeeService.removeById(id);
	}
	
	@PutMapping("employee")
	public Employee update(@RequestBody Employee employee) {
		return employeeService.update(employee);
	}
	
	@GetMapping("employees")
	public Long count(){
		return employeeService.count();
	}
	
}
