package coffeeShop.core.concretes;

import coffeeShop.core.abstracts.MernisCheckService;

public class MernisCheckManager implements MernisCheckService{

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("En az 2 kelimeden oluþmalýdýr!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()<2) {
			System.out.println("En az 2 kelimeden oluþmalýdýr!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkNationalityid(String nationalityId) {
		if(nationalityId.length()<11) {
			System.out.println("Eksik tuiþlama yaptýnýz lütfen tekrar deneyiniz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkBirthDay(int BirthDay) {
		return true;
	}

}
