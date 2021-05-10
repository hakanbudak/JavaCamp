package eTradeDemo.Core.Concrete;

import eTradeDemo.Core.Abstract.EmailService;
import eTradeDemo.Entities.Concrete.User;

public class EmailManager implements EmailService {

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Doðrulama mesajý e-postanýza gönderildi : "+user.getEmail());
		
	}

	@Override
	public void clickAndVerify(User user) {
		System.out.println("Doðrulamak için baðlantýya týklayýn : "+ user.getFirstName());
		
	}

}
