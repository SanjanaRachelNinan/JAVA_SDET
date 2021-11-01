package TestNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryToursBackend {
	WebDriver driver;
	String webDriver ="webdriver.chrome.driver";
	String driverPath ="C:\\Users\\ustjavasdetb423\\Desktop\\chromedriver_win32\\chromedriver.exe";
	String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	
  @Test(priority =0)
  public void checkUserInformation() { 
	  driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("12345678");
	  driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
	  driver.findElement(By.name("submit")).click();
	  String expected = "sign-in";
	  String actual =driver.findElement(By.linkText("sign-in")).getText();
	  Assert.assertEquals(actual,expected);
  }
  @Test(priority =1) //dijal
  public void checkSignOff() {
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  String expected ="SIGN-ON";
	  String actual = driver.findElement(By.linkText("SIGN-ON")).getText();
	  Assert.assertEquals(actual,expected);
  }
  
  @Test(priority =2)
  public void checkSignInFailureWarning() { 
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  driver.findElement(By.name("userName")).sendKeys("abcd@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("12345");
	  driver.findElement(By.name("submit")).click();
	  boolean check = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/span")).isDisplayed();
	  Assert.assertEquals(check, true);
  }
  @Test(priority =3)
  public void checkSignInSuccess() {
	  String expected = "Login Successfully";
	  driver.findElement(By.name("userName")).sendKeys("abcd@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("12345678");
	  driver.findElement(By.name("submit")).click();
	  String actual = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
	  Assert.assertEquals(actual, expected);
  }
  
  @BeforeTest
  public void loadComponents() {
		 System.setProperty(webDriver, driverPath);
		 driver = new ChromeDriver();
		 System.out.println("<-- Connecting to "+ baseURL + " -->");
		 driver.navigate().to(baseURL);
		 System.out.println("<-- Connected -->");
	 }

  @AfterTest
  public void terminateBrowser() {
	  driver.close();
  }

}
