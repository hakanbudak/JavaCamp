package coffeeShop.entities.concretes;

import coffeeShop.entities.abstracts.CoffeEntity;
import coffeeShop.entities.abstracts.Entity;

public class Coffee implements Entity,CoffeEntity{
	private int id;
	private String coffeeName;
	private int unitPrice;
	private String unitsInStock;
	
	public Coffee() {
		
	}

	public Coffee(int id, String coffeeName, int unitPrice, String unitsInStock) {
		super();
		this.id = id;
		this.coffeeName = coffeeName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(String unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}
