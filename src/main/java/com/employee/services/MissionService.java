package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.Employee;
import com.employee.entities.Mission;
import com.employee.repositories.MissionRepository;

@Service
public class MissionService {

	@Autowired
	MissionRepository missionRepository;
	
	public List<Mission> findAll(){
		return missionRepository.findAll();
	}
	
	public Mission findById(Long id) {
		return missionRepository.findById(id).get();
	}
	
	public void save(Mission mission) {
		missionRepository.save(mission);
	}
	
	public void update(Mission mission) {
		missionRepository.save(mission);
	}
	
	public void delete(Mission mission) {
		missionRepository.delete(mission);
	}
	
	public void deleteById(Long id) {
		missionRepository.deleteById(id);
	}

	public List<Employee> findEmployeesByMission(Long id){
		Mission mission=missionRepository.findById(id).get();
		return mission.getEmployees();
	}
	
}
