package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory -- OR
	@FindBy(xpath="//div[@class='header item']")
	WebElement logoImage;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactTab;
	
	// Initializing the Login Page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}	
	
	//Action Method library for Login Page
	public boolean ValidateLogoImageOnHomePage() {
	 	return logoImage.isDisplayed();
	}
	
	public boolean ValidateContactTabOnHomePage() {
		return contactTab.isDisplayed();
	}
	
	public ContactPage ClickContactTab() {
		contactTab.click();
		return new ContactPage();
	}

}
