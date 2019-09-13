package com.teammartial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class HomePage extends BasePage {
	
	By navlinkProfile=By.xpath("//a[text()='Profile']");
	
	public void goToProfile() {	
		wait.until(ExpectedConditions.visibilityOfElementLocated(navlinkProfile));
		wait.until(ExpectedConditions.elementToBeClickable(navlinkProfile));	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(navlinkProfile));
	}
	
	

}
