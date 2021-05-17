package coffeeShop.core.abstracts;

public interface MernisCheckService {
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkNationalityid(String nationalityId);
	boolean checkBirthDay(int BirthDay);
	
	
}
