package project.coffeeSCM.MongoSpringCoffee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import project.coffeeSCM.MongoSpringCoffee.model.Logs;

public interface LogsRepository extends MongoRepository<Logs, Integer>{
	
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
