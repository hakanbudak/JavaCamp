package coffeeShop.core.concretes;

import coffeeShop.core.abstracts.CampaignService;
import coffeeShop.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("Kampanya eklendi");
		
	}

}
