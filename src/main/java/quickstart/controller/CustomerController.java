package quickstart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return service.getCustomers();
	}
	@GetMapping("/customer")
	public Customer findCustomers(@RequestParam String id) {
		return service.findByCustomerId(id);
	}

}
