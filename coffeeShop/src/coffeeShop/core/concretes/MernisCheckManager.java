package coffeeShop.core.concretes;

import coffeeShop.core.abstracts.MernisCheckService;

public class MernisCheckManager implements MernisCheckService{

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("En az 2 kelimeden olu�mal�d�r!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()<2) {
			System.out.println("En az 2 kelimeden olu�mal�d�r!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkNationalityid(String nationalityId) {
		if(nationalityId.length()<11) {
			System.out.println("Eksik tui�lama yapt�n�z l�tfen tekrar deneyiniz.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkBirthDay(int BirthDay) {
		return true;
	}

}
