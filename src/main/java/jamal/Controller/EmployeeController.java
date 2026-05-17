package jamal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jamal.Entity.Employee;
import jamal.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/employee")  // Changed from @PutMapping to @PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {  // Changed to @RequestBody
	    return employeeService.saveEmployee(employee);
	}
	@GetMapping("/employee")
	public List<Employee> fetchAllEmployees() {
        return employeeService.fetchAllEmployees();}
	// 3. GET EMPLOYEE BY ID
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    // 4. UPDATE EMPLOYEE BY ID
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
        return employeeService.updateEmployeeById(id, employee);
    }

    // 5. DELETE EMPLOYEE BY ID
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        return employeeService.deleteEmployeeById(id);
    }


}
