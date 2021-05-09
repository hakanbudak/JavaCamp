package homeWork4.DataAccess.Concrete;

import homeWork4.DataAccess.Abstract.GamerDao;
import homeWork4.Entities.Concrete.Gamer;

public class HibernateGamerDao implements GamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu sisteme eklendi : "+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu sistemden silindi : "+ gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : "+ gamer.getFirstName());
		
	}

}
