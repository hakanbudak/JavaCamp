package eTradeDemo.business.Abstract;

import eTradeDemo.Entities.Concrete.User;

public interface UserService {
	void login(String email,String password);
	void register(User user);
	void registerGoogle();
}
