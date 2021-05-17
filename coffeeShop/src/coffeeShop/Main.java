package coffeeShop;

import coffeeShop.business.abstracts.UserService;
import coffeeShop.business.concretes.CheckManager;
import coffeeShop.business.concretes.UserManager;
import coffeeShop.core.concretes.CampaignManager;
import coffeeShop.core.concretes.MernisCheckManager;
import coffeeShop.dataAccess.concretes.InMemoryUserDao;
import coffeeShop.entities.concretes.Campaign;
import coffeeShop.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		UserService manager=new UserManager(new CheckManager(new MernisCheckManager(),new InMemoryUserDao(),new CampaignManager()),null);
		User user1=new User(1,"Hakan","Budak","13649188886",2000);
		Campaign campaign1=new Campaign("Bahar Kampanyasý");
		manager.coffeeSale(user1);
		manager.campaign(campaign1);
		
		

	}

}
