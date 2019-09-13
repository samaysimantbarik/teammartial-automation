package com.teammartial.stepdefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import com.teammartial.drivermanager.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Autowired
	DriverManager driverManager;
	
	@Before
	public void beforeHook() {
		driverManager.loadDriver();
		
	}

	@After
	public void tearDown() {
		//driverManager.killDriver();
	}

}
