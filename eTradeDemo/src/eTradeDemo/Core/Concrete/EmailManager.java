package eTradeDemo.Core.Concrete;

import eTradeDemo.Core.Abstract.EmailService;
import eTradeDemo.Entities.Concrete.User;

public class EmailManager implements EmailService {

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Do�rulama mesaj� e-postan�za g�nderildi : "+user.getEmail());
		
	}

	@Override
	public void clickAndVerify(User user) {
		System.out.println("Do�rulamak i�in ba�lant�ya t�klay�n : "+ user.getFirstName());
		
	}

}
