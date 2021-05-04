package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService _checkService;
	
	public StarbucksCustomerManager(ICustomerCheckService customercheckService) {
		this._checkService = customercheckService;
	}
	@Override
    public void save(Customer customer) {
        if(_checkService.CheckIfRealPerson(customer)){
            super.save(customer);
        }
        else
        {
            System.out.println("Not a valid person");
        }
    }
	
}
