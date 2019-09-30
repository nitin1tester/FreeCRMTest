package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxml4j.samples.GetThumbnails;

import com.freecrm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory -- OR
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath ="//div[text()='Login']")
	WebElement submitButton;
	
	@FindBy(xpath="//a[@href='https://api.cogmento.com/register']")
	WebElement signupLabal;
	
	@FindBy(xpath="(//div[@class='ui message']//a)[1]")
	WebElement forgotPasswordLabal;
	
	// Initializing the Login Page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action Method library for Login Page
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String eml, String pwd) {
		email.sendKeys(eml);
		password.sendKeys(pwd);
		submitButton.click();
		return new HomePage();
	}
}
