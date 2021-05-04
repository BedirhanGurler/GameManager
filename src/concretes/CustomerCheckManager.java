package concretes;

import abstracts.CustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkCustomer(Customer customer) {
		return true;
	}

}
