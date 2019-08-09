package project.coffeeSCM.MongoSpringCoffee.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import project.coffeeSCM.MongoSpringCoffee.model.Coffee;
import project.coffeeSCM.MongoSpringCoffee.model.Logs;

public interface CoffeeRepository extends MongoRepository<Coffee, Integer>{
	public Coffee findByCoffeeId(int coffeeId);
	
	//get favorite coffee
	
	/// given income it shows name and country (embedded document) 
	@Query(value= "{'userAge':{$gt:?0}}", fields="{'coffeeId':1, 'coffeeName':1}")
	List<Logs> findByPopularCoffee(int userAge); 	
}
