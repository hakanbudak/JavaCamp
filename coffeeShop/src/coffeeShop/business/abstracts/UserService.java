package coffeeShop.business.abstracts;

import coffeeShop.entities.concretes.Campaign;
import coffeeShop.entities.concretes.User;

public interface UserService {
	void coffeeSale(User user);
	void campaign(Campaign campaign);
	
}
