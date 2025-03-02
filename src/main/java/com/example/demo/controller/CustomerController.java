package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.entity.Customer;
import com.example.demo.service.AccountService;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}
	
	@PostMapping("/addcustomer")
	public void addCustomer(@RequestBody Customer customer) {
		
		customerService.addCustomer(customer);
		accountService.addAccount(new Account(customer.getId(), "Savings", "active", new Double(0)));
	}
	
	@GetMapping("/customer/id/{id}")
	public Customer getCustomerByID(@PathVariable Long id) {
		 return customerService.getCustomerById(id);
		
	}
	
	@DeleteMapping("/customer/id/{id}")
	public void deleteCustomer(@PathVariable Long id)
	{
		customerService.deleteCustomerById(id);
		accountService.deleteAccountById(id);
	}
	

}
