package homeWork4.Business.Concrete;

import homeWork4.Business.Abstract.GameService;
import homeWork4.DataAccess.Concrete.BsiGameDao;
import homeWork4.Entities.Concrete.Game;

public class GameManager implements GameService {
	private BsiGameDao gameDao;
	
	public GameManager(BsiGameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" adl� yeni oyun eklendi");
		this.gameDao.add(game);
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" adl� yeni oyun silindi");
		this.gameDao.delete(game);
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" adl� yeni oyun g�ncellendi");
		this.gameDao.update(game);
	}

}
