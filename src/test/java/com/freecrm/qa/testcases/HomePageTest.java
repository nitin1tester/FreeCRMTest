package com.freecrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.freecrm.qa.base.TestBase;
import com.freecrm.qa.pages.ContactPage;
import com.freecrm.qa.pages.HomePage;
import com.freecrm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	
	public HomePageTest() {
			super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
	}
	
	@Test
	public void HomePageLogoValidationTest() {
		boolean flag = homePage.ValidateLogoImageOnHomePage();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void ContactTabValidationTest() {
		boolean flag = homePage.ValidateContactTabOnHomePage();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void ContactPageValidationTest() {
		contactPage = homePage.ClickContactTab();
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
