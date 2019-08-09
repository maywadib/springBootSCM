package project.coffeeSCM.MongoSpringCoffee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Logs {
	private String empId;
	private int coffeeId;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}
	public Logs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Logs(String empId, int coffeeId) {
		super();
		this.empId = empId;
		this.coffeeId = coffeeId;
	}
	@Override
	public String toString() {
		return "Logs [empId=" + empId + ", coffeeId=" + coffeeId + "]";
	}
	
}
