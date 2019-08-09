package project.coffeeSCM.MongoSpringCoffee.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.coffeeSCM.MongoSpringCoffee.model.Coffee;
import project.coffeeSCM.MongoSpringCoffee.model.Employee;
import project.coffeeSCM.MongoSpringCoffee.model.Logs;
import project.coffeeSCM.MongoSpringCoffee.services.EmployeeDbService;
import project.coffeeSCM.MongoSpringCoffee.services.LogsDbService;

@RestController
public class LogsController {

	
	@Autowired
	private LogsDbService logsService;
	
	@GetMapping("/db/logs/{empId}")
	public Coffee getFavoriteCoffee(@PathVariable String empId){
		return this.logsService.getFavoriteCoffee(empId);
	}
	
	@GetMapping("/db/logs")
	public Coffee getPopularCoffee( ) {
		return this.logsService.getPopularCoffee(); 
	}
	
	
	@PutMapping("/db/logs")
	public Logs insertEmployee(@RequestBody Logs logs) {
		return 	this.logsService.insertLogs(logs);
	}
	
}
