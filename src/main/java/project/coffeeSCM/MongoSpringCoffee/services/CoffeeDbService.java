package project.coffeeSCM.MongoSpringCoffee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.coffeeSCM.MongoSpringCoffee.model.Coffee;
import project.coffeeSCM.MongoSpringCoffee.repository.CoffeeRepository;

@Service
public class CoffeeDbService {
	@Autowired
	private CoffeeRepository coffeeRepository;
	
	public Coffee getCoffeeById(int coffeeId) {
		return this.coffeeRepository.findByCoffeeId(coffeeId);
	}
	
	public List<Coffee> getAllCoffee(){
		return this.coffeeRepository.findAll();
	}
	
	public Coffee insertCoffee(Coffee coffee) {
		return this.coffeeRepository.insert(coffee);
	}
}
