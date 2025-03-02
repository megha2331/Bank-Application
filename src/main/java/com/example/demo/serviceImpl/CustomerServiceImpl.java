package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> getAllCustomers() {

		return customerDAO.findAll();
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDAO.save(customer);

	}

	@Override
	public Customer getCustomerById(Long id) {

		return customerDAO.findById(id).orElseThrow(()-> new RuntimeException("Customer ID Invalid"));
	}

	@Override
	public void deleteCustomerById(Long id) {

		Customer customer=customerDAO.findById(id).orElse(null);
		if(customer!=null)
		{
			customerDAO.deleteById(id);
		} 
		else 
		{
			throw new RuntimeException("Customer ID is invalid");
		}


	}
}
