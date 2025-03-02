package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Account;

public interface AccountService {
	
	List<Account> getAllAcounts();
	
	void addAccount(Account account);
	
	Account getAccountById(Long id);
	
	void deleteAccountById(Long id);
	
	Double getBalanceById(Long id);
	
	void depositToAccountById(Long id, Double amount);
	
	void withdrawFromAccountByID(Long id, Double amount);
	

}
