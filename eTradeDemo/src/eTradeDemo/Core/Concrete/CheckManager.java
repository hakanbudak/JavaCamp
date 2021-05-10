package eTradeDemo.Core.Concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTradeDemo.Core.Abstract.CheckService;

public class CheckManager implements CheckService{
	public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("En az iki karakterden oluþmalýdýr!!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()<2) {
			System.out.println("En az iki karakterden oluþmalýdýr");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length()<6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(!matcher.matches()) {
			System.out.println("Uygun e-postayý Regex formatýnda girmediniz!!!");
			return false;
		}
		return true;
		}

}
