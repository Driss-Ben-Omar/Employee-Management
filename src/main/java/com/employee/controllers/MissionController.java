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
import com.employee.entities.Mission;
import com.employee.services.MissionService;

@RestController
public class MissionController {
	
	@Autowired
	MissionService missionService;
	
	@GetMapping("mission")
	public List<Mission> findAll(){
		return missionService.findAll();
	}
	
	@GetMapping("mission/{id}")
	public Mission findById(@PathVariable Long id) {
		return missionService.findById(id);
	}
	
	@PostMapping("mission")
	public void save(@RequestBody Mission mission) {
		missionService.save(mission);
	}
	
	@PutMapping("mission")
	public void update(@RequestBody Mission mission) {
		missionService.update(mission);
	}
	
	@DeleteMapping("mission")
	public void delete(@RequestBody Mission mission) {
		missionService.delete(mission);
	}
	
	@DeleteMapping("mission/{id}")
	public void deleteById(@PathVariable Long id) {
		missionService.deleteById(id);
	}

	@GetMapping("mission/{id}/empolyees")
	public List<Employee> findEmployeesByMission(@PathVariable Long id){
		return missionService.findEmployeesByMission(id);
	}
	
}
