package project.coffeeSCM.MongoSpringCoffee.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import project.coffeeSCM.MongoSpringCoffee.model.Logs;
import project.coffeeSCM.MongoSpringCoffee.repository.CoffeeRepository;
import project.coffeeSCM.MongoSpringCoffee.repository.EmployeeRepository;
import project.coffeeSCM.MongoSpringCoffee.repository.LogsRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = {project.coffeeSCM.MongoSpringCoffee.repository.CoffeeRepository.class, project.coffeeSCM.MongoSpringCoffee.repository.EmployeeRepository.class, project.coffeeSCM.MongoSpringCoffee.repository.LogsRepository.class})
public class MongoConfig {
	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository,CoffeeRepository coffeeRepository, LogsRepository logsRepository) {
		return string -> {
//			employeeRepository.insert(new Employee("mayur","mayurpswd"));
//			employeeRepository.insert(new Employee("sai","saipswd"));
//			employeeRepository.insert(new Employee("umang","umangpswd"));
//			employeeRepository.insert(new Employee("sia","siapswd"));
//			employeeRepository.insert(new Employee("baba","babapswd"));
//			
//			
//			
//			coffeeRepository.insert(new Coffee(1,"Cappuccino","70%","30%"));
//			coffeeRepository.insert(new Coffee(2,"Espresso","50%","50%"));
//			coffeeRepository.insert(new Coffee(3,"Lattee","50%","50%"));
//			coffeeRepository.insert(new Coffee(4,"Filter Coffee","50%","50%"));
//			
//			logsRepository.insert(new Logs("mayur", 1));
//			logsRepository.insert(new Logs("sai", 1));
//			logsRepository.insert(new Logs("sai", 1));
//			logsRepository.insert(new Logs("mayur", 2));
//			logsRepository.insert(new Logs("umang", 4));
//			logsRepository.insert(new Logs("umang", 4));
//			logsRepository.insert(new Logs("mayur", 1));
//			logsRepository.insert(new Logs("umang", 1));
//			logsRepository.insert(new Logs("mayur", 1));
//			logsRepository.insert(new Logs("umang", 1));
//			logsRepository.insert(new Logs("sai", 2));
//			
//			umang fav - flitercoffee
//			mayur fav - capp
//			sai fav - capp
//			popular - capp
			
//			logsRepository.insert(new Logs("umang", 4));
//			logsRepository.insert(new Logs("umang", 4));
//			logsRepository.insert(new Logs("umang", 4));
//			logsRepository.insert(new Logs("umang", 4));

		};
	}
}
