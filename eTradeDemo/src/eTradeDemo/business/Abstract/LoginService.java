package eTradeDemo.business.Abstract;

import eTradeDemo.Entities.Concrete.User;

public interface LoginService {
	void login(String email,String password);
	void register(User user );
}
