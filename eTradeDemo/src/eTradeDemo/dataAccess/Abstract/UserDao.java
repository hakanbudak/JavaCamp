package eTradeDemo.dataAccess.Abstract;

import java.util.List;

import eTradeDemo.Entities.Concrete.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean getByEmail(User user);
	User getByLoginInfo (String email, String password);
	List<User> getAll();
}
