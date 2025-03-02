package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomers();
	
	void addCustomer(Customer customer);
	
	Customer getCustomerById(Long id);
	
	void deleteCustomerById(Long id);
	

}
