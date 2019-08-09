package project.coffeeSCM.MongoSpringCoffee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Coffee {
	@Id
	private int coffeeId;
	private String coffeeName;
	private String milkPercent;
	private String coffeePercent;
	@Override
	public String toString() {
		return "Coffee [coffeeId=" + coffeeId + ", coffeeName=" + coffeeName + ", milkPercent=" + milkPercent
				+ ", coffeePercent=" + coffeePercent + "]";
	}
	public Coffee(int coffeeId, String coffeeName, String milkPercent, String coffeePercent) {
		super();
		this.coffeeId = coffeeId;
		this.coffeeName = coffeeName;
		this.milkPercent = milkPercent;
		this.coffeePercent = coffeePercent;
	}
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCoffeeId() {
		return coffeeId;
	}
	public void setCoffeeId(int coffeeId) {
		this.coffeeId = coffeeId;
	}
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public String getMilkPercent() {
		return milkPercent;
	}
	public void setMilkPercent(String milkPercent) {
		this.milkPercent = milkPercent;
	}
	public String getCoffeePercent() {
		return coffeePercent;
	}
	public void setCoffeePercent(String coffeePercent) {
		this.coffeePercent = coffeePercent;
	}
}
