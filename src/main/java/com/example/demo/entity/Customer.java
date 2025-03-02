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
public class Customer {
	
	@Id
	private Long id;
	
	private String name;
	
	private String city;
	
	private String state;
	
	private Integer pincode;
	
	private Long phoneNum;
	
	

	public Customer() {
		super();
		
	}


	public Customer(Long id, String name, String city, String state, Integer pincode, Long phoneNum) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phoneNum = phoneNum;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Integer getPincode() {
		return pincode;
	}


	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}


	public Long getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", phoneNum=" + phoneNum + "]";
	}
	
	

}
