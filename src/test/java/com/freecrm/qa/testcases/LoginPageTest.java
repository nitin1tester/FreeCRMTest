package com.freecrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.base.TestBase;
import com.freecrm.qa.pages.HomePage;
import com.freecrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;	
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();		
	}
	
	@Test(priority = 1)
	public void LoginPageTitleTest() {
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority = 2)
	public void LoginTest() {
	 	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	 	boolean flag =  homePage.ValidateLogoImageOnHomePage();
	 	Assert.assertTrue(flag);
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
