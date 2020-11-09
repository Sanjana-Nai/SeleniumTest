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
public class AddPersonalDetailsPage {

	public AddPersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="1_inputfileddiv")
	private WebElement bloodgroup;
	
	@FindBy(xpath="//span[.='B']")
	private WebElement B;
	
	@FindBy(id="5")
	private WebElement hobbies;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement next;
	
	public void clickOnBloodGroup() {
		bloodgroup.click();
	}
	
	public void clickOnBBloodGroup() {
		B.click();
	}
	
	public void enterHobbies(String hobby) {
		hobbies.sendKeys(hobby);
	}
	
	public void clickOnNextbtn() {
		next.click();
	}
	
}
