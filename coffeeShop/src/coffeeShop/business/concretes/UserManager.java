package coffeeShop.business.concretes;

import coffeeShop.business.abstracts.CheckService;
import coffeeShop.business.abstracts.UserService;
import coffeeShop.core.abstracts.CampaignService;
import coffeeShop.entities.concretes.Campaign;
import coffeeShop.entities.concretes.User;

public class UserManager implements UserService{
	private CheckService service;
	private CampaignService campaignService;
	

	public UserManager(CheckService service,CampaignService campaignService) {
		super();
		this.service = service;
		this.campaignService=campaignService;
	}

	@Override
	public void coffeeSale(User user) {
		System.out.println("Kahve satýldý "+user.getFirstName());
		service.verify(user);
		
	}

	@Override
	public void campaign(Campaign campaign) {
		System.out.println("Bahar kampanyasý eklendi");
		
		
	}



}
