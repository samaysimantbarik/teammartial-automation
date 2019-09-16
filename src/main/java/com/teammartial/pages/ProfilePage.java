package com.teammartial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

@Component
public class ProfilePage extends BasePage  {

	By pageHeader=By.cssSelector(".reference-content .text-light");
	By editLink= By.cssSelector("i.fa-edit");
	
	public String getPageHeading() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pageHeader));
		return driver.findElement(pageHeader).getText();
	}
	
	public void clickEditProfileLink() {
		wait.until(ExpectedConditions.elementToBeClickable(editLink));
		action.click(driver.findElement(editLink)).build().perform();
		
	}
	
	public String getAddress() {
		WebElement ele=driver.findElement(By.xpath("//div[text()='Address ']/../following-sibling::div/div"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		return ele.getText();
	}
	public String getState() {
		return driver.findElement(By.xpath("//div[text()='State ']/../following-sibling::div/div")).getText();
	}
	public String getZipcode() {
		return driver.findElement(By.xpath("//div[text()='Zip Code ']/../following-sibling::div/div")).getText();
	}
}
