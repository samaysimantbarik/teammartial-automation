package com.teammartial.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.javafaker.Faker;
import com.teammartial.drivermanager.DriverManager;

import io.github.cdimascio.dotenv.Dotenv;

public class BasePage {

	@Autowired
	WebDriver driver;

	@Autowired
	WebDriverWait wait;

	@Autowired
	Actions action;
	
	protected JavascriptExecutor jsexec;
	
	

	protected Faker faker;

	public BasePage() {
		faker = new Faker();
		jsexec= (JavascriptExecutor) driver;

	}

}
