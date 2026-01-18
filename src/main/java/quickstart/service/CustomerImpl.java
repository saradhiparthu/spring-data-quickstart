package quickstart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public List<Customer> getCustomers() {
		return repository.findAll();
	}
	@Override
	public Customer findByCustomerId(String customerID) {
		return repository.findByCustomerId(customerID);
	}

}
