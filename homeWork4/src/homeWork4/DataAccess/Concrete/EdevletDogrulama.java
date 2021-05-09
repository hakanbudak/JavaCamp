package homeWork4.DataAccess.Concrete;

import homeWork4.DataAccess.Abstract.Verification;

public class EdevletDogrulama implements Verification {

	@Override
	public void verification(String message) {
		System.out.println("Edevlet doðrulandý :  "+ message);
		
	}

}
