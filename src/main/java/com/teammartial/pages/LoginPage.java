package com.teammartial.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;



@Component
public class LoginPage extends BasePage {
	
	public void goToPage(String url) {
		driver.get(url);
	}
	
	public void loginToApplication(String userName, String password) {	
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
	}

}
