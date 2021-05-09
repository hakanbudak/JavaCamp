package homeWork4.Business.Concrete;

import homeWork4.Business.Abstract.CampaignService;
import homeWork4.Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli yeni kampanya eklendi!");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli yeni kampanya silindi!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli yeni kampanya güncellendi!");
		
	}

}
