package jamal.service;

import java.util.List;

import jamal.Entity.Employee;

public interface EmployeeService  {
	
		Employee saveEmployee(Employee employee);
		List<Employee> fetchAllEmployees();
	    Employee getEmployeeById(int id);
	    Employee updateEmployeeById(int id, Employee employee);
	    String deleteEmployeeById(int id);
	}
	
	
	

