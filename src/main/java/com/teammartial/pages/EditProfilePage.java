package com.teammartial.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Component;

@Component
public class EditProfilePage extends BasePage {

	By phoneNumberField= By.xpath("//div[text()='Phone No. ']/following::input");

	By addressField= By.xpath("//div[text()='Address ']/following::textarea");
	By stateDropdown= By.xpath("//div[text()='State ']/following::select");
	By cityDropdown= By.xpath("//div[text()='City ']/following::select");
	By zipCodeField= By.xpath("//div[text()='Zip Code ']/following::input");
	By updateButton= By.xpath("//button[text()='Update']");
	
	
    public void editPhoneNumber(String value) {
    	WebElement ele=driver.findElement(phoneNumberField);
    	ele.clear();
    	ele.sendKeys(value);
    }
    
    public void setAddress(String value) {
    	WebElement ele=driver.findElement(addressField);
    	ele.clear();
    	ele.sendKeys(value);
    }
    
    public void setState(String state) {
    	new Select(driver.findElement(stateDropdown)).selectByVisibleText(state);
    }
    
    public void setCity(String city) {
    	new Select(driver.findElement(cityDropdown)).selectByVisibleText(city);
    }
    
    public void setZipCode(String zipcode) {
    	WebElement ele=driver.findElement(zipCodeField);
    	ele.clear();
    	ele.sendKeys(zipcode);
    }
    
    public void clickUpdateButton() {
    	driver.findElement(updateButton).click();
    	Alert alert=  driver.switchTo().alert();
    	alert.accept();
    }
	
}
