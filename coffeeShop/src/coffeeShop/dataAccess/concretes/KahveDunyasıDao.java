package coffeeShop.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import coffeeShop.dataAccess.abstracts.CoffeeDao;
import coffeeShop.entities.concretes.Coffee;

public class KahveDunyasýDao implements CoffeeDao {
	List<Coffee> coffee=new ArrayList<Coffee>();
	@Override
	public void add(Coffee coffee) {
		this.coffee.add(coffee);
		System.out.println("Eklendi "+coffee.getCoffeeName());
		
	}

	@Override
	public void delete(Coffee coffee) {
		this.coffee.remove(coffee);
		System.out.println("Silindi! "+coffee.getCoffeeName());
		
	}

	@Override
	public List<Coffee> getAll() {
		return this.coffee;
	}

}
