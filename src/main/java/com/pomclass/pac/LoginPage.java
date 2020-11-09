package com.pomclass.pac;
/**
 * @author Sanjana
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement login;
	
	public void enterUsername(String un) {
		username.sendKeys(un);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
}
