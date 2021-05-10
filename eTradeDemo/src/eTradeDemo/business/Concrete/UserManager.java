package eTradeDemo.business.Concrete;

import eTradeDemo.Core.Abstract.GoogleService;
import eTradeDemo.Entities.Concrete.User;
import eTradeDemo.business.Abstract.LoginService;
import eTradeDemo.business.Abstract.UserService;

public class UserManager implements UserService{

		private LoginService loginService;
		private GoogleService googleService;
		
	public UserManager(LoginService loginService,GoogleService googleService) {
			super();
			this.loginService = loginService;
			this.googleService=googleService;
		}

	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
		
		
	}

	@Override
	public void register(User user) {
		loginService.register(user);
		
	}

	@Override
	public void registerGoogle() {
		googleService.register();
		
	}

}

	