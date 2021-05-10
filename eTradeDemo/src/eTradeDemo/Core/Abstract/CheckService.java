package eTradeDemo.Core.Abstract;

public interface CheckService {
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkPassword(String password);
	boolean checkEmail(String email);
}
