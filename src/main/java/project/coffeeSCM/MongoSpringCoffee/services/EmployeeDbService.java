package project.coffeeSCM.MongoSpringCoffee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.coffeeSCM.MongoSpringCoffee.model.Employee;
import project.coffeeSCM.MongoSpringCoffee.repository.EmployeeRepository;

@Service
public class EmployeeDbService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee getEmployeeById(String empId) {
		return this.employeeRepository.findByEmpId(empId);
	}
	
	public Employee insertEmployee(Employee emp) {
		return this.employeeRepository.insert(emp);
	}
	
	public List<Employee> getAllEmployees(){
		return this.employeeRepository.findAll();
	}
}
