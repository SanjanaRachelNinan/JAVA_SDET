package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTestNG {
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\geckodriver.exe";
	    public WebDriver driver; 
	    public String expected = null;
	    public String actual = null;
	        @BeforeTest
	      public void launchBrowser() {
	        	System.out.println("Launching Chrome browser"); 
	        	System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb423\\Desktop\\chromedriver_win32\\chromedriver.exe");
			  	  driver= new ChromeDriver();
			      driver.navigate().to(baseUrl);
			      driver.manage().window().maximize();
	      }
	      
	      @BeforeMethod
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	      }
	          @Test(priority = 0)
	      public void register(){
	          driver.findElement(By.linkText("REGISTER")).click() ;
	          expected = "Register: Mercury Tours";
	          actual = driver.getTitle();
	          Assert.assertEquals(actual, expected);
	      }
	          @Test(priority = 1)
	      public void support() {
	            driver.findElement(By.linkText("SUPPORT")).click() ;
	            expected = "Under Construction: Mercury Tours";
	            actual = driver.getTitle();
	            Assert.assertEquals(actual, expected);
	      }
	      @AfterMethod
	      public void goBackToHomepage ( ) {
	            driver.findElement(By.linkText("Home")).click() ;
	      }
	       
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
	      }
	}

