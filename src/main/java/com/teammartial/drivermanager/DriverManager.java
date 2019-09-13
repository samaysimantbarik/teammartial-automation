package com.teammartial.drivermanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class DriverManager {

	public WebDriver driver;
	public Actions action;
	public WebDriverWait wait;


	@Bean
	public WebDriver loadDriver() {
		Dotenv dotenv = Dotenv.load();
		switch (dotenv.get("BROWSER")) {
		case "CHROME":
			//ChromeDriverManager.getInstance().setup();
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "FIREFOX":
			FirefoxDriverManager.getInstance().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("No Browser Specified");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(dotenv.get("TIMEOUT")), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(dotenv.get("PAGELOAD_TIMEOUT")), TimeUnit.SECONDS);
		return driver;
	}

	
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	@Bean
	public WebDriverWait setWebDriverWait() {
	    wait= new WebDriverWait(driver,20);
		return wait;
	}
	
	@Bean
	public Actions loadActionsClass() {
		action= new Actions(driver);
		return action;
	}
	
	
	
}
