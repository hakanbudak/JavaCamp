package coffeeShop.business.abstracts;

import coffeeShop.entities.concretes.Campaign;
import coffeeShop.entities.concretes.User;

public interface CheckService {
	void verify(User user);
	void campaign(Campaign campaign);
}
