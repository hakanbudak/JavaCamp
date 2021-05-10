package eTradeDemo.Core.Abstract;

import eTradeDemo.Entities.Concrete.User;

public interface EmailService {
	void sendVerifyEmail(User user);
	void clickAndVerify(User user);
}
