package Dws_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dws_Login_Page {
	
	//constructor
	public Dws_Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement emailTextBox;
	@FindBy(xpath = "//input[@id='Password']")
	WebElement passwordTextBox;
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;
	//Actions or methods of webElements
	
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	
	

}
