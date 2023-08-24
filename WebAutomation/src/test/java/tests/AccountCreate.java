package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.CreateAnAccountPage;
import pages.HomePage;

public class AccountCreate extends BaseDriver{
	
	@Test
	public void createAnAccount() {
		HomePage homePage = new HomePage();
		CreateAnAccountPage accountPage = new CreateAnAccountPage();
		
		homePage.clickOnSignIn();
		homePage.sendEmail();
		homePage.clickOnAccountButton();
		
		accountPage.fillPersonalInformation();
		accountPage.yourAddress();
	}
	
	@BeforeClass
	public void startUrl() {
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
}
