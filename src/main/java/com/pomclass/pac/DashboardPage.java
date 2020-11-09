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
public class DashboardPage {

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[.='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//span[.='Leave']")
	private WebElement leave;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp;
	
	@FindBy(xpath="//span[.='Assign Leave']")
	private WebElement assignleave;
	
	@FindBy(xpath="//span[.='Leave List']")
	private WebElement leavelist;
	
	@FindBy(xpath="//i[.='keyboard_arrow_down']")
	private WebElement arrow;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public void clickOnPIM() {
		pim.click();
	}
	
	public void clickOnAddEmployee() {
		addEmp.click();
	}
	
	public void clickOnLeave() {
		leave.click();
	}
	
	public void clickOnAssignLeave() {
		assignleave.click();
	}
	
	public void clickOnLeaveList() {
		leavelist.click();
	}
	
	public void clickOnArrowDropdown() {
		arrow.click();
	}
	
	public void clickOnLogout() {
		logout.click();
	}
}
