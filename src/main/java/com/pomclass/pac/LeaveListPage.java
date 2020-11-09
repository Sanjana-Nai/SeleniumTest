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
public class LeaveListPage {

	public LeaveListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="from")
	private WebElement from;
	
	@FindBy(id="to")
	private WebElement to;
	
	@FindBy(id="selectedEmployee_value")
	private WebElement emp;
	
	@FindBy(xpath="//label[.='All']")
	private WebElement all;
	
	@FindBy(xpath="//button[.='Search']")
	private WebElement search;
	
	@FindBy(xpath="//label[.='Rejected']")
	private WebElement rejected;
	
	public void enterFromdate(String fromdate) {
		from.sendKeys(fromdate);
	}
	
	public void enterToDate(String todate) {
		from.sendKeys(todate);
	}
	
	public void enterEmpName(String EmpName) {
		emp.sendKeys(EmpName);
	}
	
	public void clickOnAllCheckbox() {
		all.click();
	}
	
	public void clickOnSearchBtn() {
		search.click();
	}
	
	public void clickOnRejectedCheckbox() {
		rejected.click();
	}
}
