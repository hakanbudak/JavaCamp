package homeWork4.Entities.Concrete;

import homeWork4.Entities.Abstract.Entity;
import homeWork4.Entities.Abstract.OrderEntity;

public class Campaign implements Entity,OrderEntity {
	private int id;
	private String name;
	
	public Campaign() {
		
	}

	public Campaign(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
