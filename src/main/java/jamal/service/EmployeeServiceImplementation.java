package jamal.service;


import jamal.Entity.Employee;
import jamal.Repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        }
        return null; // Alternatively, throw a ResourceNotFoundException
    }

    @Override
    public Employee updateEmployeeById(int id, Employee employee) {
        Optional<Employee> employee1 = employeeRepository.findById(id);
        
        if (employee1.isPresent()) {
            Employee originalEmployee = employee1.get();
            
            if (Objects.nonNull(employee.getEmpName()) && !"".equalsIgnoreCase(employee.getEmpName())) {
            	originalEmployee.setEmpName(employee.getEmpName());}
            if(Objects.nonNull(employee.getSalary()) && employee.getSalary() !=0) {
            	originalEmployee.setSalary(employee.getSalary());}
            
            return employeeRepository.save(originalEmployee);
        }
        
        return null;
    }

	@Override
	public String deleteEmployeeById(int id) {
		if(employeeRepository.findById(id).isEmpty()) {
			employeeRepository.deleteById(id);
			return "Record Successfully Deleted";
			
		}
		return null;
	}
    
    
    
}