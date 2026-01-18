package quickstart.service;

import java.util.List;

public interface CustomerService {

	public List<Customer> getCustomers();
	public Customer findByCustomerId(String customerID);
}
