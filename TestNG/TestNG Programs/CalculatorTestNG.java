package TestNGpractice;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTestNG {
		   WebDriver ob;
		   
		   @BeforeTest
		   public void launchapp() {
		      // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		      //ob.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      
		      // Launch website
		      System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb423\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  	  ob= new ChromeDriver();
		      ob.navigate().to("http://www.calculator.net");
		      ob.manage().window().maximize();
		   }
		   
		   @Test
		   public void calculatepercent() {
		      // Click on Math Calculators
			   ob.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[3]/div[2]/a")).click();
			   System.out.println("***Click on Math calculator is working***");	
			   
		      // Click on Percent Calculators
			   ob.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a")).click();
			   System.out.println("***Click on Percent calculator is working***");
			   
		      // Enter value 10 in the first number of the percent Calculator
			   ob.findElement(By.id("cpar1")).sendKeys("10");
			   System.out.println("***Entered value 10 in the first number of the percent Calculator***");
			   
		      // Enter value 50 in the second number of the percent Calculator
			   ob.findElement(By.id("cpar2")).sendKeys("50");
			   System.out.println("***Entered value 50 in the second number of the percent Calculator***");
		      
		      // Click Calculate Button
			   ob.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
			   System.out.println("***Click on Calculate Button is working***");
			   
		      // Get the Result Text based on its xpath
		      String result =
		    		  ob.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();
		      System.out.println("***Got the Result Text based on its xpath***");
		      
		      // Print a Log In message to the screen
		      System.out.println(" The Result is " + result);
		      
		      if(result.equals("5")) {
		         System.out.println("The Result is Pass");
		      } else {
		         System.out.println("The Result is Fail");
		      }
		      System.out.println("***Printed a Log In message to the screen***");
		   }
		   
		   @AfterTest
		   public void terminatetest() {
			   ob.close();
		   }
		}

