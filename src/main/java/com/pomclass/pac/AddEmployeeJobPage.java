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
public class AddEmployeeJobPage {

	public AddEmployeeJobPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='9_inputfileddiv']/..//input[@class='select-dropdown']")
	private WebElement region;
	
	@FindBy(xpath="//span[.='Region-1']")
	private WebElement region1;
	
	@FindBy(id="10_inputfileddiv")
	private WebElement fte;
	
	@FindBy(xpath="//span[.='0.5']")
	private WebElement fte1;
	
	@FindBy(id="11_inputfileddiv")
	private WebElement dept;
	
	@FindBy(xpath="//span[.='Sub unit-1']")
	private WebElement subunit;
	
	@FindBy(xpath="//button[.='Save']")
	private WebElement save;
	
	public void enterRegion() {
		region.click();
	}
	
	public void enterRegion1() {
		region1.click();
	}
	
	public void clickOnfte() {
		fte.click();
	}
	
	public void clickOnFte1() {
		fte1.click();
	}
	
	public void clickOnTemporaryDept() {
		dept.click();
	}
	
	public void clickOnSubUnit1() {
		subunit.click();
	}
	
	public void clickOnSaveBtn() {
		save.click();
	}
}
