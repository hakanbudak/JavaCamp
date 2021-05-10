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
				System.out.println("Giriþ baþarýlý!");
				return;
			}
			System.out.println("Giriþ baþarýsýz!");
			
		}
		
	}

	@Override
	public void register(User user) {
		if(!userDao.getByEmail(user)) {
			System.out.println("Kayýt baþarýsýz \n"+user.getEmail()+" Bu email daha önce kullanýlmýþ!!");
			return;
		}
		if(checkService.checkFirstName(user.getFirstName())) {
			System.out.println("Ýsim doðrulandý");
		}else {
			return;
		}
		if(checkService.checkLastName(user.getLastName())) {
			System.out.println("Soyad doðrulandý");
		}else {
			return;
		}
		if(checkService.checkEmail(user.getEmail())) {
			System.out.println("Email doðrulandý");
		}else {
			return;
		}
		if(checkService.checkPassword(user.getPassword())) {
			System.out.println("Þifre doðrulandý");
		}else {
			return;
		}
		
		emailService.clickAndVerify(user);
		emailService.sendVerifyEmail(user);
		
		userDao.add(user);
		System.out.println("Kayýt baþarýlý. Hoþgeldin : "+user.getFirstName());
	}
	
}
