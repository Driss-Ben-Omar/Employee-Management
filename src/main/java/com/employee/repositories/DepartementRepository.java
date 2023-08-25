package com.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long>{

}
