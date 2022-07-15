package com.springboot.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.project.model.Empolyee;


public interface EmployeeRepository extends JpaRepository<Empolyee, Long> {

	//List<Empolyee> findAllByNameLike();

//	Empolyee findByfirstName = null;
//
//	Optional<Empolyee> findByfirstName(Object first_name);

//	List<Empolyee> findByname(String first_name);

	//Object findAll(String string, String string2, String first_name);

	
	                                 

}
