<<<<<<< HEAD
package com.example.springboot.services;

import java.util.List;

import com.example.springboot.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
}
=======
package com.example.springboot.services;

import java.util.List;

import com.example.springboot.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
}
>>>>>>> fbf558e1d5a02f2cb34c27c924b1e54a4f44962a
