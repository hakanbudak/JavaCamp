package coffeeShop.entities.concretes;

import coffeeShop.entities.abstracts.CoffeEntity;
import coffeeShop.entities.abstracts.Entity;

public class User implements Entity,CoffeEntity {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int date;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String nationalityId, int date) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
}
