package com.springboot.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

//import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.project.exception.ResourceNotFoundException;
import com.springboot.project.model.Empolyee;
import com.springboot.project.repository.EmployeeRepository;
import com.springboot.project.service.EmployeeService;

//import antlr.collections.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {
     
	//private static final int Empolyee = 0;
	//private static final int Optional = 0;
	private EmployeeRepository employeeRespository;
	
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRespository) {
		super();
		this.employeeRespository = employeeRespository;
	}



	@Override
	public Empolyee saveEmployee(Empolyee empolyee) {
		return employeeRespository.save(empolyee);
		
	}



	@Override
	public java.util.List<Empolyee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRespository.findAll();
	}



	@Override
	public Empolyee getEmployeeById(long id) {
//		Optional<Empolyee> employee = employeeRespository.findById(id);
//		
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "Id", id, id);
//		}
		
		return employeeRespository.findById(id).orElseThrow(() ->
		            new ResourceNotFoundException("Employee", "Id", id));
		
		
  }



//	@Override
//	public Object findByname(String first_name) {
//		// TODO Auto-generated method stub
//		return employeeRespository.findAll("Employee", "first_name", first_name);
//	}



//	@Override
//	public List<Empolyee> getAllEmployeesName() {
//		// TODO Auto-generated method stub
//		return null;
//	}



	


	


//	@Override
//	public List<Empolyee> findAllByNameLike() {
//		// TODO Auto-generated method stub
//		return employeeRespository.findAllByNameLike();
//	}



//	@Override
//	public List<Empolyee> getEmpolyees1() {
//		
//		// TODO Auto-generated method stub
//		return employeeRespository.findOne);
//	}



	
	
	
}
