package eTradeDemo.business.Concrete;

import eTradeDemo.Core.Abstract.CheckService;
import eTradeDemo.Core.Abstract.EmailService;
import eTradeDemo.Entities.Concrete.User;
import eTradeDemo.business.Abstract.LoginService;
import eTradeDemo.dataAccess.Abstract.UserDao;

public class LoginManager implements LoginService{
	private EmailService emailService;
	private CheckService checkService;
	private UserDao userDao;
	
	public LoginManager(EmailService emailService,CheckService checkService,UserDao userDao) {
		super();
		this.emailService = emailService;
		this.checkService=checkService;
		this.userDao=userDao;
	}

	@Override
	public void login(String email, String password) {
		for (User user:userDao.getAll()) {
			if(email==user.getEmail() && password==user.getPassword()) {
				System.out.println("Giri� ba�ar�l�!");
				return;
			}
			System.out.println("Giri� ba�ar�s�z!");
			
		}
		
	}

	@Override
	public void register(User user) {
		if(!userDao.getByEmail(user)) {
			System.out.println("Kay�t ba�ar�s�z \n"+user.getEmail()+" Bu email daha �nce kullan�lm��!!");
			return;
		}
		if(checkService.checkFirstName(user.getFirstName())) {
			System.out.println("�sim do�ruland�");
		}else {
			return;
		}
		if(checkService.checkLastName(user.getLastName())) {
			System.out.println("Soyad do�ruland�");
		}else {
			return;
		}
		if(checkService.checkEmail(user.getEmail())) {
			System.out.println("Email do�ruland�");
		}else {
			return;
		}
		if(checkService.checkPassword(user.getPassword())) {
			System.out.println("�ifre do�ruland�");
		}else {
			return;
		}
		
		emailService.clickAndVerify(user);
		emailService.sendVerifyEmail(user);
		
		userDao.add(user);
		System.out.println("Kay�t ba�ar�l�. Ho�geldin : "+user.getFirstName());
	}
	
}
