package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDAO;
import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDAO accountDAO;
	
	@Override
	public List<Account> getAllAcounts() {
		return accountDAO.findAll();
	}

	@Override
	public void addAccount(Account account) {
		accountDAO.save(account);
		
	}

	@Override
	public Account getAccountById(Long id) {
		
		return accountDAO.findById(id).orElseThrow(()-> new RuntimeException("Account ID is invalid"));
	}

	@Override
	public void deleteAccountById(Long id) {
		Account account=accountDAO.findById(id).orElse(null);
		 if(account!=null) {
			 accountDAO.deleteById(id);
		 } else {
		 throw new RuntimeException("Account ID is invalid ");
		 }
		
	}

	@Override
	public Double getBalanceById(Long id) {
		
		return accountDAO.getBalanaceById(id);
	}

	@Override
	public void depositToAccountById(Long id, Double amount) {
		
		accountDAO.depositToAccountById(id, amount);
	}

	@Override
	public void withdrawFromAccountByID(Long id, Double amount) {
		accountDAO.withdrawFromAccountById(id, amount);
		
	}

	
	
	
	

}
