package homeWork4.Entities.Concrete;

import homeWork4.Entities.Abstract.Entity;
import homeWork4.Entities.Abstract.OrderEntity;

public class Gamer implements Entity,OrderEntity {
	private int id;
	private String firstName;
	private String lastName;
	private int nationalityId;
	private int birthday;
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstName, String lastName, int nationalityId, int birthday) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthday = birthday;
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

	public int getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(int nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
}
