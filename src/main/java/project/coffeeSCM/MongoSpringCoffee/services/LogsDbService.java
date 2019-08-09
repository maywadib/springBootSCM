package project.coffeeSCM.MongoSpringCoffee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.coffeeSCM.MongoSpringCoffee.model.Coffee;
import project.coffeeSCM.MongoSpringCoffee.model.Logs;
import project.coffeeSCM.MongoSpringCoffee.repository.LogsRepository;

@Service
public class LogsDbService {
	@Autowired
	private LogsRepository logsRepository;
	
	public Coffee getFavoriteCoffee(String empId) {
		//log->coffee return
		
		return null;//
	}
	
	public Coffee getPopularCoffee() {
		return null;//	
	}
	
	
	
	public Logs insertLogs(Logs logs) {
		return this.logsRepository.insert(logs);
	}
}
