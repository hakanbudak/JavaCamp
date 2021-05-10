package eTradeDemo;

import eTradeDemo.Core.Abstract.EmailService;
import eTradeDemo.Core.Adapters.GoogleManagerAdapter;
import eTradeDemo.Core.Concrete.CheckManager;
import eTradeDemo.Core.Concrete.EmailManager;
import eTradeDemo.Entities.Concrete.User;
import eTradeDemo.business.Abstract.UserService;
import eTradeDemo.business.Concrete.LoginManager;
import eTradeDemo.business.Concrete.UserManager;
import eTradeDemo.dataAccess.Concrete.InMemory.HibernateUserDao;

public class Main {

	public static void main(String[] args) {

		UserService userService=new UserManager(new LoginManager(new EmailManager(), new CheckManager(), new HibernateUserDao()), new GoogleManagerAdapter());
		
		User user=new User(1,"Hakan","Budak","Hakan@gmail.com","123456");
		userService.register(user);
		userService.login("Hakan@gmail.com", "123456");
		System.out.println("Google simulasyon.");
		System.out.println("-----------------");
		userService.registerGoogle();
		
	
		
	}

}
