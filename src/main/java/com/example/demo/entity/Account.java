package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class Account {
	
	@Id
	private Long id;
	
	private String type;
	
	private String status;
	
	private Double balance;
	

	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Long id, String type, String status, Double balance) {
		super();
		this.id = id;
		this.type = type;
		this.status = status;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", type=" + type + ", status=" + status + ", balance=" + balance + "]";
	}
	
	
	

}
