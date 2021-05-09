package homeWork4.Entities.Concrete;

import homeWork4.Entities.Abstract.Entity;
import homeWork4.Entities.Abstract.OrderEntity;

public class Game implements Entity,OrderEntity {
	private int id;
	private String gameName;
	private int price;
	private int unitsInStock;
	
	public Game() {
		
	}

	public Game(int id, String gameName, int price, int unitsInStock) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.unitsInStock = unitsInStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}
