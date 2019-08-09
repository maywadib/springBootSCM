package project.coffeeSCM.MongoSpringCoffee.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.coffeeSCM.MongoSpringCoffee.model.Employee;
import project.coffeeSCM.MongoSpringCoffee.services.EmployeeDbService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDbService employeeService;
	
	@GetMapping("/db/employees")
	public List<Employee> getAllEmployees(){
		return this.employeeService.getAllEmployees();
	}
	
	@GetMapping("/db/employees/exists/{empId}")
	public Employee checkEmployeeExists(@PathVariable String empId) {
		return this.employeeService.getEmployeeById(empId); 
	}
	
	@GetMapping("/db/employees/validate/{empId}/{empPassword}")
	public boolean validateEmployee(@PathVariable String empId, @PathVariable String empPassword) {
		Employee employee = this.employeeService.getEmployeeById(empId);
		
		if(employee.getEmpPassword().equals(empPassword)) return true;
		else return false;
	}
	
	@PutMapping("/db/employee")
	public Employee insertEmployee(@RequestBody Employee employee) {
		return 	this.employeeService.insertEmployee(employee);
	}
}
