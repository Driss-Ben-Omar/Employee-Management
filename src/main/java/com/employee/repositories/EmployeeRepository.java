package com.employee.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.entities.Address;
import com.employee.entities.Departement;
import com.employee.entities.Employee;
import com.employee.entities.EmployeeRole;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	public List<Employee> findByFirstName(String firstName);
	
	public List<Employee> findByLastName(String lastName);
	
	public List<Employee> findByFirstNameAndLastName(String firstName,String lastName);
	
	public Employee findByEmail(String email);
	
	public List<Employee> findByBirthdate(LocalDate birthdate);
	
	public List<Employee> findByRole(EmployeeRole role);
	
	public List<Employee> findByDepartement(Departement departement);
	
	public Employee findByAddress(Address address);
	
	@Query("SELECT count(*) FROM Employee")
	public Long countAllEmployee();

}
