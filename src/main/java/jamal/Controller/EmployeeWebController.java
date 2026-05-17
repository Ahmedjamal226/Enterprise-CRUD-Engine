
	package jamal.Controller;

	import jamal.Entity.Employee;
	import jamal.service.EmployeeService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.*;

	@Controller
	@RequestMapping("/web")
	public class EmployeeWebController {

	    @Autowired
	    private EmployeeService employeeService;

	    // Serves the HTML view dashboard at http://localhost:8080/web/employees
	    @GetMapping("/employees")
	    public String viewDashboard(Model model) {
	        model.addAttribute("employees", employeeService.fetchAllEmployees());
	        model.addAttribute("employee", new Employee()); 
	        return "index"; 
	    }

	    // Processes the HTML web form submission
	    @PostMapping("/employees/save")
	    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
	        employeeService.saveEmployee(employee);
	        return "redirect:/web/employees"; 
	    }

	    // Deletes an employee via click from the web page button
	    @GetMapping("/employees/delete/{id}")
	    public String deleteEmployee(@PathVariable("id") int id) {
	        employeeService.deleteEmployeeById(id);
	        return "redirect:/web/employees"; 
	    }
	}


