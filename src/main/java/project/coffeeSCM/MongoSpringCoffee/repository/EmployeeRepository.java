package project.coffeeSCM.MongoSpringCoffee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import project.coffeeSCM.MongoSpringCoffee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{
	public Employee findByEmpId(String id);
}
