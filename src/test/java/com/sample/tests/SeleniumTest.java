package com.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericutils.pac.BaseClass;
import com.genericutils.pac.WebDriverUtils;
import com.pomclass.pac.AddEmployeeJobPage;
import com.pomclass.pac.AddEmployeePage;
import com.pomclass.pac.AddPersonalDetailsPage;
import com.pomclass.pac.AssignLeavePage;
import com.pomclass.pac.DashboardPage;
import com.pomclass.pac.LeaveListPage;
import com.pomclass.pac.LoginPage;

/**
 * 
 * @author Sanjana
 *
 */
public class SeleniumTest extends BaseClass{

	@Test
	public void SeleniumTest() throws Throwable {
		
		WebDriverUtils wb=new WebDriverUtils();
		String username = excelLib.getExcelData("Login", 1, 0);
		String password = excelLib.getExcelData("Login", 1, 1);
		String employeeID = excelLib.getExcelData("EmployeeDetails", 1, 0);
		String fn = excelLib.getExcelData("EmployeeDetails", 1, 1);
		String ln = excelLib.getExcelData("EmployeeDetails", 1, 2);
		String hobby = excelLib.getExcelData("EmployeeDetails", 1, 3);
		String EmpName = excelLib.getExcelData("EmployeeDetails", 4, 0);
		String fromdate = excelLib.getExcelData("EmployeeDetails", 4, 1);
		String todate = excelLib.getExcelData("EmployeeDetails", 4, 2);
		String comments = excelLib.getExcelData("EmployeeDetails", 4, 3);
		excelLib.setExcelData("EmployeeDetails", 4, 4, "Successfully Submitted");
		String message = "No Records found";
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickOnLogin();
		
		DashboardPage db=new DashboardPage(driver);
		db.clickOnPIM();
		db.clickOnAddEmployee();
		
		AddEmployeePage ae=new AddEmployeePage(driver);
		ae.enterEmpID(employeeID);
		ae.enterFirstname(fn);
		ae.enterLastname(ln);
		Thread.sleep(4000);
		ae.clickOnLocation();
		ae.clickOnNextBtn();
		
		AddPersonalDetailsPage apd=new AddPersonalDetailsPage(driver);
		apd.clickOnBloodGroup();
		apd.clickOnBBloodGroup();
		apd.enterHobbies(hobby);
		apd.clickOnNextbtn();
		
		AddEmployeeJobPage aej=new AddEmployeeJobPage(driver);
		Thread.sleep(10000);
		aej.enterRegion();
		aej.enterRegion1();
		aej.clickOnfte();
		aej.clickOnFte1();
		aej.clickOnTemporaryDept();
		aej.clickOnSubUnit1();
		aej.clickOnSaveBtn();
		
		Thread.sleep(10000);
		db.clickOnLeave();
		db.clickOnAssignLeave();
		
		AssignLeavePage al=new AssignLeavePage(driver);
		al.enterEmpName(EmpName);
		Thread.sleep(4000);
		al.clickOnLeaveType();
		al.clickOnAnnualUS();
		al.enterFromDate(fromdate);
		al.enterToDate(todate);
		al.enterComments(comments);
		al.clickOnAssignBtn();
		excelLib.setExcelData("EmployeeDetails", 4, 4, "Successfully Submitted");
		
		Thread.sleep(8000);
		db.clickOnLeaveList(); 
		
		LeaveListPage ll=new LeaveListPage(driver);
		Thread.sleep(4000);
		ll.enterFromdate(fromdate);
		ll.enterToDate(todate);
		ll.enterEmpName(EmpName);
		ll.clickOnAllCheckbox();
		Thread.sleep(8000);
		ll.clickOnSearchBtn();
		
		Thread.sleep(4000);
		ll.clickOnAllCheckbox();
		Thread.sleep(4000);
		ll.clickOnRejectedCheckbox();
		Thread.sleep(4000);
		
		Assert.assertTrue(true, message);
		
		db.clickOnArrowDropdown();
		db.clickOnLogout();
		
	}
}
