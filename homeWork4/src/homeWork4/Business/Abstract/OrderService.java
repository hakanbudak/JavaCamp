package homeWork4.Business.Abstract;

import java.util.List;

import homeWork4.Entities.Abstract.OrderEntity;

public interface OrderService  {
	void sale(List<OrderEntity> orders);
}
