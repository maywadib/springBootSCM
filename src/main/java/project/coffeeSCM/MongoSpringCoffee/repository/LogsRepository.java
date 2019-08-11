package project.coffeeSCM.MongoSpringCoffee.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import project.coffeeSCM.MongoSpringCoffee.model.Logs;

public interface LogsRepository extends MongoRepository<Logs, Integer>{
	
	@Query(value="{'empId': {$eq : ?}}")
	List<Logs> getLogForEmployee(String empId);
	
	
//query -> get popular coffee
//	db.logs.aggregate([
//	{"$group" : {_id:"$coffeeId" ,count:{$sum:1}}},
//	{$sort:{"count":-1}},
//	{$limit:1},
//	{
//		$project:{
//			coffeeId:1
//		}
//	}
//	]);
	
//query -> get favorite coffee
//	db.logs.aggregate([
//	{$match : {empId:"umang"}},
//	{"$group" : {_id:"$coffeeId" ,count:{$sum:1}}},
//	{$sort:{"count":-1}},
//	{$limit:1},
//	{
//		$project:{
//			coffeeId:1
//		}
//	}
//	]);
	
	
//original query
//	db.logs.aggregate([
//	{$match : {empId:"umang"}},
//	{"$group" : {_id:"$coffeeId" ,count:{$sum:1}}},
//	{$sort:{"count":-1}},
//	{$limit:1},
//	{
//		$project:{
//			coffeeId:1
//		}
//	}
//	]);
}
