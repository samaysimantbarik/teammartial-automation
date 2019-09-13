package com.teammartial.utils;

import java.util.Locale;

import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Component
public class TestData {
	
	private Faker faker;
	
	String phoneNumber;
	String address;
	String state;
	String city;
	String zipCode;
	
	
	public TestData() {
		faker = new Faker(new Locale("en-US"));
		phoneNumber=faker.phoneNumber().toString();
		address=faker.address().streetAddress();
		state= faker.address().state();
		city=faker.address().city();
		zipCode= faker.address().zipCode();
		
	}
	
	

	
	public String getZipCode() {
		return zipCode;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public String getState() {
		return state;
	}


	public String getCity() {
		return city;
	}


	
	

	
	
	

}
