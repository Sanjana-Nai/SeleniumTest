package com.pomclass.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Sanjana
 *
 */
public class AddEmployeePage {

	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="employeeId")
	private WebElement empId;
	
	@FindBy(id="firstName")
	private WebElement firstname;
	
	@FindBy(id="lastName")
	private WebElement lastname;
	
	@FindBy(id="location_inputfileddiv")
	private WebElement loc;
	
	@FindBy(xpath="//span[contains(.,'Australian ')]")
	private WebElement australia;
	
	@FindBy(id="systemUserSaveBtn")
	private WebElement next;
	
	public void enterEmpID(String employeeID) {
		empId.sendKeys(employeeID);
	}
	
	public void enterFirstname(String fn) {
		firstname.sendKeys(fn);
	}
	
	public void enterLastname(String ln) {
		lastname.sendKeys(ln);
	}
	
	public void clickOnLocation() {
		loc.click();
		australia.click();
	}
	
	public void clickOnNextBtn() {
		next.click();
	}
	
	
}
