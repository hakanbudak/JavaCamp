package homeWork4.Business.Concrete;

import java.util.List;

import homeWork4.Business.Abstract.GamerService;
import homeWork4.DataAccess.Abstract.GamerDao;
import homeWork4.DataAccess.Abstract.Verification;
import homeWork4.Entities.Concrete.Gamer;

public class GamerManager implements GamerService {
	private GamerDao gamerDao;
	private Verification verification;
	
		
	public GamerManager(GamerDao gamerDao,Verification verification) {
		super();
		this.gamerDao = gamerDao;
		this.verification=verification;
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklendi");
		this.gamerDao.add(gamer);
		this.verification.verification(gamer.getFirstName());
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi");
		this.gamerDao.delete(gamer);
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi");
		this.gamerDao.update(gamer);
	}

	@Override
	public List<Gamer> getAll(Gamer[] gamer) {
		for (Gamer gamers : gamer) {
			System.out.println(gamers.getFirstName());
		}
		return null;
	}
	
	
	

}
