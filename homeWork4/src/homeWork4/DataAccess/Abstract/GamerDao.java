package homeWork4.DataAccess.Abstract;

import homeWork4.Entities.Concrete.Gamer;

public interface GamerDao {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
	
}
