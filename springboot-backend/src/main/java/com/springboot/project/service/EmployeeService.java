package com.springboot.project.service;

import com.springboot.project.model.Empolyee;
import java.util.List;
//import antlr.collections.List;

public interface EmployeeService {
Empolyee saveEmployee(Empolyee empolyee);
  List<Empolyee> getAllEmployees();
 Empolyee getEmployeeById(long id);
//List<Empolyee> getEmpolyees1();
//List<EmployeeService> findByfirstName(String first_name);
//Empolyee getEmployeeByfirstName(String employeefirstName);
//List<Empolyee> getAllEmployeesName();
//List<Empolyee> findAllByNameLike();
//Object findByUsername(String name);
//Object findByname(String first_name);


}
