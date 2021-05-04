package Adapters;


import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer)  {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result = true;
		
		KPSPublicSoap kpsPublic = new KPSPublicSoapProxy();
		try {
			result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName(),customer.getBirthDate());
		}catch(Exception exception){
			
		}
		
		return result;
	}


}
