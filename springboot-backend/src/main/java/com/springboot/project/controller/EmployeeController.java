package com.springboot.project.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.springboot.project.model.Empolyee;
import com.springboot.project.repository.EmployeeRepository;
import com.springboot.project.service.EmployeeService;

//import antlr.collections.List;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController<Employee> {

	//private static final int ResponseEntity = 0;
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	// build create employee REST API
	@PostMapping()
	public ResponseEntity<Empolyee> saveEmployee(@RequestBody Empolyee employee){
		 
		return new ResponseEntity<Empolyee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	
	//build get all employee REST API
	@GetMapping
	public List<Empolyee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	// build get employee by id REST API
	@GetMapping("{id}")
	public ResponseEntity<Empolyee> getEmployeeById(@PathVariable("id") long employeeId) {
		return new ResponseEntity<Empolyee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
		
	}
	
//	@GetMapping("{first_name}")
//	public List<Empolyee> getAllEmployeesName(@PathVariable("first_name") String employeeName){
//		return employeeService.getAllEmployeesName();
//	}
	
//}
//	
//	@GetMapping("{first_name}")
//	public ResponseEntity<Empolyee> getEmployeeByfirstName(@PathVariable("first_name") String employeefirstName) {
//		return new ResponseEntity<Empolyee>(employeeService.getEmployeeByfirstName(employeefirstName), HttpStatus.OK);
//		
//	}
	
//	@GetMapping("/{first_name}")
//	public List<Empolyee> findByfirstName(@PathVariable("first_name") String firstName){
//		
//		return EmployeeRepository.findByfirstName(first_name);
//	}
	
//	@SuppressWarnings("unchecked")
//	@GetMapping("/name")
//	public List<Employee> getEmployees_first_name(){
//		return (List<Employee>) 
//		
//	}
		 
//	@GetMapping("/name")
//	public 
	
	
	
	
}
