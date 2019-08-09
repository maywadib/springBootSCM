package project.coffeeSCM.MongoSpringCoffee.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import project.coffeeSCM.MongoSpringCoffee.model.Coffee;
import project.coffeeSCM.MongoSpringCoffee.services.CoffeeDbService;
import project.coffeeSCM.MongoSpringCoffee.services.LogsDbService;

@RestController
public class CoffeeController {
	@Autowired
	private CoffeeDbService coffeeService;
	private LogsDbService logService;
	
	@GetMapping("/db/coffee/{id}")
	public Coffee getCoffeeById(@PathVariable int id) {
		//insert in log
		return this.coffeeService.getCoffeeById(id);
	}
	
	//get popular coffee
	@GetMapping("/db/coffee/popular")
	public Coffee getPopularCoffee() {
		return this.logService.getPopularCoffee();
	}
	
	@GetMapping("/db/coffee/favorite/{id}")
	public Coffee getFavoriteCoffee(@PathVariable String id) {
		return this.logService.getFavoriteCoffee(id);
	}
	
	@GetMapping("/db/coffee")
	public List<Coffee> getAllCoffee(){
		return this.coffeeService.getAllCoffee();
	}
}
