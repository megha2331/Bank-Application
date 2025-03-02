package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/accounts")
	public List<Account> getAllAccounts()
	{
		return accountService.getAllAcounts();
	}
	
	@GetMapping("/account/id/{id}")
	public Account addAccount(@PathVariable Long id)
	{
		return accountService.getAccountById(id);
	}
	
	@DeleteMapping("/account/id/{id}")
	public void deleteAccount(@PathVariable Long id)
	{
		accountService.deleteAccountById(id);
	}
	
	@GetMapping("/account/id/{id}/balance")
	public Double getAccountBalance(@PathVariable Long id) {
		
		return accountService.getBalanceById(id);
	}
	
	@PutMapping("/account/id/{id}/deposit/{amount}")
	public void depositToAccount(@PathVariable Long id, @PathVariable Double amount)
	{
		accountService.depositToAccountById(id, amount);
	}
	
	@PutMapping("/account/id/{id}/withdraw/{amount}")
	public void withdrawFromAccount(@PathVariable Long id, @PathVariable Double amount)
	{
		accountService.withdrawFromAccountByID(id, amount);
	}
	

}
