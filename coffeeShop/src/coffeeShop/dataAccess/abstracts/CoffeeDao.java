package coffeeShop.dataAccess.abstracts;

import java.util.List;

import coffeeShop.entities.concretes.Coffee;

public interface CoffeeDao {
	void add(Coffee coffee);
	void delete(Coffee coffee);
	List<Coffee> getAll();
}
