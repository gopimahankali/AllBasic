package Dws_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dws_Register_page {
	
	//Constructor
	public Dws_Register_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement maleRadioButton;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstNameTextBox;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastNameTextBox;
	@FindBy(xpath="//input[@id='Email']")
	WebElement emailTextBox;
	@FindBy(xpath="//input[@id='Password']")
	WebElement passwordTextBox;
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confirmPasswordTextBox;
	@FindBy(xpath="//input[@id='register-button']")
	WebElement registerButton;
	
	//Actions or methods of webElements
	
	public void clickMaleRadioButton() {
		maleRadioButton.click();
	}
	public void enterFirstName(String firstName) {
		firstNameTextBox.sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		lastNameTextBox.sendKeys(lastName);
	}
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}	
	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordTextBox.sendKeys(confirmPassword);
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}
	
	

}
