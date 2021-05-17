package coffeeShop.business.concretes;

import coffeeShop.business.abstracts.CheckService;
import coffeeShop.core.abstracts.MernisCheckService;
import coffeeShop.core.concretes.CampaignManager;
import coffeeShop.core.concretes.MernisCheckManager;
import coffeeShop.dataAccess.abstracts.UserDao;
import coffeeShop.dataAccess.concretes.InMemoryUserDao;
import coffeeShop.dataAccess.concretes.KahveDunyasýDao;
import coffeeShop.entities.concretes.Campaign;
import coffeeShop.entities.concretes.User;

public class CheckManager implements CheckService {
	 
	private MernisCheckManager mernisManager;
	private InMemoryUserDao userDao;
	private CampaignManager campaignManager;
	public CheckManager(MernisCheckManager mernisManager,InMemoryUserDao userDao,CampaignManager campaignManager) {
		super();
		this.mernisManager=mernisManager;
		this.userDao=userDao;
		this.campaignManager=campaignManager;
	}
	@Override
	public void verify(User user) {
		if(mernisManager.checkFirstName(user.getFirstName())) {
			System.out.println("Ýsim doðrulandý!");
		}else {
			return;
		}
		
		if(mernisManager.checkLastName(user.getLastName())) {
			System.out.println("Soyad doðrulandý!");
		}else {
			return;
			
		}
		if(mernisManager.checkNationalityid(user.getNationalityId())) {
			System.out.println("TC No doðrulandý!");
		}else {
			return;
		}
		
		if(mernisManager.checkBirthDay(user.getDate())) {
			System.out.println("Doðum tarihi doðrulandý!");
		}else {
			return;
		}
		
		userDao.add(user);
		System.out.println("Kayýt Baþarýlý. Hoþgeldin : "+ user.getFirstName() );
		
	}
	@Override
	public void campaign(Campaign campaign) {
		System.out.println("Bahar kampanyasý eklendi");
		campaignManager.campaignAdd(campaign);
		
	}

}
