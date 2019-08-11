package project.coffeeSCM.MongoSpringCoffee.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.stereotype.Service;

import project.coffeeSCM.MongoSpringCoffee.model.Coffee;
import project.coffeeSCM.MongoSpringCoffee.model.Logs;
import project.coffeeSCM.MongoSpringCoffee.repository.CoffeeRepository;
import project.coffeeSCM.MongoSpringCoffee.repository.LogsRepository;

@Service
public class LogsDbService {
	@Autowired
	private LogsRepository logsRepository;
	@Autowired
	private CoffeeRepository coffeeRepository;
	
	public Coffee getFavoriteCoffee(String empId) {
		List<Logs> logs = logsRepository.findAll();
		
		Map<Integer, Long> coffeeLog = logs.stream().filter(p -> p.getEmpId().equalsIgnoreCase(empId)).collect(Collectors.groupingBy(p -> p.getCoffeeId(),Collectors.counting()));	
		
		return this.coffeeRepository.findByCoffeeId(this.getCoffeeId(coffeeLog));
		
	}
	
	public Coffee getPopularCoffee() {
		List<Logs> logs = logsRepository.findAll();
		Map<Integer, Long> coffeeLog = logs.stream().collect(Collectors.groupingBy(p -> p.getCoffeeId(),Collectors.counting()));	
		
		return this.coffeeRepository.findByCoffeeId(this.getCoffeeId(coffeeLog));
	}
	
	public List<Logs> getAllLogs(){
		return logsRepository.findAll();
	}
	
	
	
	public Logs insertLogs(Logs log) {
		return this.logsRepository.insert(log);
	}
	
	private static Integer getCoffeeId(Map<Integer,Long> coffeeLog) {
		Long maxValue = (long) 0;
		for(Long value : coffeeLog.values()) {
			if(maxValue <= value) maxValue = value;
		}
		Integer CoffeeKey = 0;
		for(Integer key : coffeeLog.keySet()) {
			if(coffeeLog.get(key) == maxValue) CoffeeKey = key; 
		}
		return CoffeeKey;
	}
}
