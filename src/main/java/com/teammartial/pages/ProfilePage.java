package com.teammartial.pages;

import org.openqa.selenium.By;
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
		//jsexec.executeScript("arguments[0].click();",driver.findElement(editLink));
		action.click(driver.findElement(editLink)).build().perform();
		
	}
}
