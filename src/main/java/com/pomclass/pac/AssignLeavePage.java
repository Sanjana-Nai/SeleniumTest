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
public class AssignLeavePage {

	public AssignLeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="employee_value")
	private WebElement emp;
	
	@FindBy(id="leaveType_inputfileddiv")
	private WebElement leavetype;
	
	@FindBy(xpath="//span[.='Annual-US']")
	private WebElement AnnualUS;
	
	@FindBy(id="from")
	private WebElement from;
	
	@FindBy(id="to")
	private WebElement to;
	
	@FindBy(id="comment")
	private WebElement comment;
	
	@FindBy(xpath="//button[.='Assign']")
	private WebElement assign;
	
	public void enterEmpName(String EmpName) {
		emp.sendKeys(EmpName);
	}
	
	public void clickOnLeaveType() {
		leavetype.click();
	}
	
	public void clickOnAnnualUS() {
		AnnualUS.click();
	}
	
	public void enterFromDate(String fromdate) {
		from.sendKeys(fromdate);
	}
	
	public void enterToDate(String todate) {
		from.sendKeys(todate);
	}
	
	public void enterComments(String comments) {
		comment.sendKeys(comments);
	}
	
	public void clickOnAssignBtn() {
		assign.click();
	}
}
