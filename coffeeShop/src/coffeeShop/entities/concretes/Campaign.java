package coffeeShop.entities.concretes;

import coffeeShop.entities.abstracts.CoffeEntity;
import coffeeShop.entities.abstracts.Entity;

public class Campaign implements Entity,CoffeEntity{
	private String name;

	public Campaign(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
