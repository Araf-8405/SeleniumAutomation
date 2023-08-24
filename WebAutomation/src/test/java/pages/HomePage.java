package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;
import utilities.CommonMethods;

public class HomePage extends CommonMethods{
	
	public HomePage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	//@FindBy  = driver.findelement(By.)
	@FindAll({
		@FindBy(xpath = "//a[contains(text(),'Sign in')]"),
		@FindBy(xpath = "//a[@title= 'Log in to your customer account']")
	})
	WebElement signIn;
	
	@FindAll({
		@FindBy(id = "email_create"),
		@FindBy(xpath = "//input[@name='email_create']")
	})
	WebElement emailAddress;
	
	@FindAll({
		@FindBy(id = "SubmitCreate"),
		@FindBy(xpath = "//button[@id='SubmitCreate']']")
	})
	WebElement accountButton;
	
	public void clickOnSignIn() {
		signIn.click();
	}
	
	public void sendEmail() {
		String email = emailGenerate();
		sendText(emailAddress, email);
		timeOut(2000);
	}
	
	public void clickOnAccountButton() {
		accountButton.click();
		timeOut(10000);
	}
	
}
