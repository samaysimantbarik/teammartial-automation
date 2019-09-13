package com.teammartial.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class EditProfilePage extends BasePage {

	By phoneNumberField= By.xpath("//div[text()='Phone No. ']/following::input");

	By addressField= By.xpath("//div[text()='Address ']/following::textarea");
	By stateDropdown= By.xpath("//div[text()='State ']/following::select");
	By cityDropdown= By.xpath("//div[text()='City ']/following::select");
	By zipCodeField= By.xpath("//div[text()='Zip Code ']/following::input");
	
	
    public void editPhoneNumber() {
    	WebElement ele=driver.findElement(phoneNumberField);
    	ele.clear();
    	ele.sendKeys(faker.phoneNumber().toString());
    }
    
    public void setAddress() {
    	WebElement ele=driver.findElement(addressField);
    	ele.clear();
    	ele.sendKeys(faker.address().toString());
    }
	
}
