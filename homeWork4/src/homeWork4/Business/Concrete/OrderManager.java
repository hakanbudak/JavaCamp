package homeWork4.Business.Concrete;

import java.util.List;

import homeWork4.Business.Abstract.OrderService;
import homeWork4.Entities.Abstract.OrderEntity;

public class OrderManager implements OrderService {

	@Override
	public void sale(List<OrderEntity> orders) {
		System.out.println("Satýþ baþarýyla gerçekleþti!");
		
	}

}
