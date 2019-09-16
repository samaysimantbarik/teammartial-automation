package com.teammartial.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.teammartial.drivermanager.DriverManager;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Autowired
	DriverManager driverManager;
	
	@Autowired
	WebDriver driver;
	
	@Before
	public void beforeHook() {
		driverManager.loadDriver();
		
	}

	@After
	public void tearDown(Scenario scenario) {
	System.out.println("Scenario Status:"+scenario.getStatus());
	addScreenshot(scenario);
//		if(scenario.isFailed()) {
//			addScreenshot(scenario);
//		}
	}
	
	private void addScreenshot(Scenario scenario) {
		try {
			String fileName= System.getProperty("user.dir")+"/target/screenshots/"+scenario.getName()+".png";
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

}
