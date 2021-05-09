package homeWork4.DataAccess.Abstract;

import homeWork4.Entities.Concrete.Game;

public interface GameDao {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	
}
