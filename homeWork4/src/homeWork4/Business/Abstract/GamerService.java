package homeWork4.Business.Abstract;

import java.util.List;

import homeWork4.Entities.Concrete.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
	List<Gamer> getAll(Gamer[] gamer);
	
	
}
