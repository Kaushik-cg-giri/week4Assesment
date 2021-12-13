package com.example.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.lti.model.Customer;
import com.example.lti.service.CustomerService;

@CrossOrigin(origins = "*")
@RequestMapping
@RestController
public class CustomerController {
	@Autowired
	public CustomerService service; 
	
	@RequestMapping
	@GetMapping("/customer")
	public List<Customer> get(){
		return service.viewCustomer();
	}
	
	@PostMapping("/customer")
	public Customer insert(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
	}
	
	@DeleteMapping("/Cutsomer/{id}")
	public String remove(@PathVariable Integer id) {
		return service.delete(id);
	}
	
	@PutMapping("/Customer")
	public String update(@RequestBody Customer customer) {
		
		Customer customer1 =new Customer();
		customer1.setId(customer.getId());
		customer1.setAddress(customer.getAddress());
		customer1.setName(customer.getName());
		customer1.setAge(customer.getAge());
		customer1.setType(customer.getType());
		return service.updateCustomer(customer1);
	}
}
