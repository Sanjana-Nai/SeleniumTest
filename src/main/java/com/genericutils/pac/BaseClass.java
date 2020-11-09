package com.genericutils.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
/**
 * 
 * @author Sanjana
 *
 */
public class BaseClass {

	 public DatabaseLib dbLib = new DatabaseLib();
	   public ExcelLib excelLib = new ExcelLib();
	   public FileLib fLib = new FileLib();
	   public WebDriverUtils wLib = new WebDriverUtils();
	   public WebDriver driver = null;
		
		@BeforeSuite
		public void configBS() {
			/*connect to db*/
			dbLib.connectToDB();
		}
		
		@BeforeClass
		public void configBC() throws Throwable{
			   String BROWSER = fLib.getPropertyKeyValue("browser");
			  
			 if(BROWSER.equals("chrome")) {
			   driver= new ChromeDriver();
			 } else if(BROWSER.equals("firefox")) {
				driver = new FirefoxDriver();
			 }else if(BROWSER.equals("ie")) {
					driver = new InternetExplorerDriver();
		     }else {
		    	 driver = new FirefoxDriver();
		     }
			 
		}
		
	/*	@Parameters("browser")
		@BeforeTest
		public void configBT(String BROWSER) throws Throwable{
			  
			 if(BROWSER.equals("chrome")) {
			   driver= new ChromeDriver();
			 } else if(BROWSER.equals("firefox")) {
				driver = new FirefoxDriver();
			 }else if(BROWSER.equals("ie")) {
					driver = new InternetExplorerDriver();
		     }else {
		    	 driver = new FirefoxDriver();
		     }
			 
		}*/
		
		@BeforeMethod
		public void configBM() throws Throwable {
			/* read data from property File */
			//String USERNAME = fLib.getPropertyKeyValue("username");
			//String PASSWORD = fLib.getPropertyKeyValue("password");
			String URL = fLib.getPropertyKeyValue("url");
		
			/*login to app*/
			wLib.waitForPagetoLoad(driver);
			driver.get(URL);
			
			
			
			
			
			
			
		}
		
		@AfterMethod
		public void configAm() {
			/*logout */
			
			
			
			
			
		}
		
		@AfterClass
		public void configAC(){
			/*close the browser*/
			driver.close();
		}
		
		
		@AfterSuite
		public void confiAs() {
			/*dissconnect to db*/
			dbLib.dissconnectToDb();
		}
}
