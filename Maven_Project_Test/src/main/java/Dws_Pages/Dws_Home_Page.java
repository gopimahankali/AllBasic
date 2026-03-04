package Dws_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dws_Home_Page {

	//Constructor
	public Dws_Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	//WebElements
	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement searchTextBox;
	@FindBy(xpath = "//input[@value='Search']")
	WebElement searchButton;
	
	//Register Page WebElements
	@FindBy(linkText = "Register")
	WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	WebElement loginLink;
	
	//Actions or methods of webElements
	public void enterSearchText(String value) {
		searchTextBox.sendKeys(value);
	}
	public void clickSearchButton() {
		searchButton.click();
	}
	public void clickRegisterLink() {
		registerLink.click();
	}
	public void clickLoginLink() {
		loginLink.click();
	}
	
	
	
	
}
