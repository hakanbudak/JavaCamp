package homeWork4.DataAccess.Concrete;

import homeWork4.DataAccess.Abstract.GameDao;
import homeWork4.Entities.Concrete.Game;

public class BsiGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi "+game.getGameName());
		
	}

}
