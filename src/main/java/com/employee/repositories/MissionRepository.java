package com.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entities.Mission;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long>{

}
