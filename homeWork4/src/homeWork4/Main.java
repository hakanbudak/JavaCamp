package homeWork4;

import java.util.ArrayList;
import java.util.List;

import homeWork4.Business.Concrete.CampaignManager;
import homeWork4.Business.Concrete.GameManager;
import homeWork4.Business.Concrete.GamerManager;
import homeWork4.Business.Concrete.OrderManager;
import homeWork4.DataAccess.Concrete.BsiGameDao;
import homeWork4.DataAccess.Concrete.EdevletDogrulama;
import homeWork4.DataAccess.Concrete.HibernateGamerDao;
import homeWork4.Entities.Abstract.OrderEntity;
import homeWork4.Entities.Concrete.Campaign;
import homeWork4.Entities.Concrete.Game;
import homeWork4.Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setFirstName("Hakan");
		
		Game game1=new Game();
		game1.setGameName("Cs:Go");
		
		Campaign campaign1=new Campaign();
		campaign1.setName("Yaz kampanyasý");
		
		List<OrderEntity> sale=new ArrayList<OrderEntity>();
		sale.add(game1);
		sale.add(gamer1);
		sale.add(campaign1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		
		GameManager gameManager = new GameManager(new BsiGameDao());
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);
		
		GamerManager gamerManager = new GamerManager(new HibernateGamerDao(),new EdevletDogrulama());
		gamerManager.add(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		
		OrderManager orderManager = new OrderManager();
		orderManager.sale(sale);
	
		
		
		
		

	}

}
