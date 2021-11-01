package TestNGpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryTours {
	
		WebDriver driver;
		String webDriver ="webdriver.chrome.driver";
		String driverPath ="C:\\Users\\ustjavasdetb423\\Desktop\\chromedriver_win32\\chromedriver.exe";
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		
	 @BeforeTest
	 public void loadComponents() {
		 System.setProperty(webDriver, driverPath);
		 driver = new ChromeDriver();
	 }
	 @BeforeMethod
	 public void connectWebsite() {
		 System.out.println("<-- Connecting to "+ baseURL + " -->");
		 driver.navigate().to(baseURL);
		 System.out.println("<-- Connected -->");
	 }
	 @Test
	 public void checkTitle() {
		 String expected = "Register: Mercury Tours";
		 String actual = driver.getTitle();
		 Assert.assertEquals(expected, actual);
	 }
	 
	 @Test
	 public void checkUserInformationWarning() {
		  
		  driver.findElement(By.id("email")).sendKeys("abcd@gmail.com"); 
		  driver.findElement(By.name("password")).sendKeys("12345678");
		  driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		  driver.findElement(By.name("submit")).click();
		  boolean warning = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/span")).isDisplayed();
		  Assert.assertEquals(warning, true);
	 }
		 
	  @Test
	  public void checkUserInformation() {
		  driver.findElement(By.id("email")).sendKeys("abcd@gmail.com"); 
		  driver.findElement(By.name("password")).sendKeys("12345678");
		  driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
		  driver.findElement(By.name("submit")).click();
		  String expected = "sign-in";
		  String actual =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")).getText();
		  Assert.assertEquals(actual,expected);
	  }
	 
	  @Test
	  public void checkCountryDrpdwn() { 
		  List<WebElement> options = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option"));
		  for(int i=0;i<options.size();i++) {
			  options.get(i).click();
			  boolean isSelc = options.get(i).isSelected();
			  Assert.assertEquals(isSelc, true);
		  }
	  }
	  @Test
	  public void find() { 
		  Select drpCountry = new Select(driver.findElement(By.name("country")));
			 drpCountry.selectByVisibleText("ANTARCTICA");
	  }
	  @Test
	  public void checkNavBar() { 
		  for(int i=1;i<=2;i++) {
			  String xpath ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td["+i+"]/a";
			  WebElement navElement = driver.findElement(By.xpath(xpath));
			  String pageName = navElement.getText().toLowerCase();
			  String flpageName = pageName.substring(0,1).toUpperCase();
			  pageName = flpageName+pageName.substring(1);
			  String expected = pageName+": Mercury Tours";
			  navElement.click();
			  String actual = driver.getTitle();
			  Assert.assertEquals(actual, expected);
			  
		  }
		 
	  }
	  @Test
	  public void checkLinkClickWorking() {  
	 
	List<WebElement> alllinks = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
	String a[]=new String[alllinks.size()];
	System.out.println("links: "+alllinks.size());
	    for(int i=0;i<alllinks.size();i++) {
	    a[i]=alllinks.get(i).getText();
	   
	   
	    }
	    for(int i=0;i<alllinks.size();i++) {
	    System.out.println("clicking on link::"+ driver.findElement(By.linkText(a[i])).getText());
	driver.findElement(By.linkText(a[i])).click();

	    }
	    }
	  @Test
		public void checkRoutingOfSidebar() {  
		  List<WebElement> alllinks = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		  String arr1[]=new String[alllinks.size()];
		  System.out.println("links: "+alllinks.size());
		      for(int i=0;i<alllinks.size();i++) {
		      arr1[i]=alllinks.get(i).getText();
		     
		     
		      }
			String[] arr2 = { "Welcome: Mercury Tours", "Find a Flight: Mercury Tours:",
					"Under Construction: Mercury Tours", "Under Construction: Mercury Tours", "Welcome: Mercury Tours",
					"Under Construction: Mercury Tours", "Under Construction: Mercury Tours", };

			for (int i = 0; i < arr1.length; i++) {
				driver.findElement(By.linkText(arr1[i])).click();
				String e = driver.getTitle();
				Assert.assertEquals(arr2[i], e);
			}
		}
	  
		@Test
		public void f3() {
			driver.findElement(By.linkText("Flights")).click();
			Select s1 = new Select(driver.findElement(By.name("fromPort")));
			s1.selectByValue("New York");
			driver.findElement(By.xpath(
					"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"))
					.click();
			;
			driver.findElement(By.name("findFlights")).click();
			String a = "After flight finder - No Seats Avaialble  ";
			String e = driver.findElement(By.xpath(
					"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]"))
					.getText();
			Assert.assertEquals(a, e);
		}

		@Test
		public void f4() {
		String e=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(1) > table > tbody > tr > td > table > tbody > tr > td > p:nth-child(1) > img")).getAttribute("alt");
		Assert.assertEquals("Mercury Tours", e);
		}
		@Test
		public void f5() {
			String e=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td")).getAttribute("bgcolor");
			Assert.assertEquals("#FF9900", e);
		}
		@Test
		public void f6() {
			driver.findElement(By.linkText("Home")).click();
			String e=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(1) > td > font > b")).getText();
			Assert.assertEquals("Jul 6, 2017", e);
		}

	  @AfterTest
	  public void terminateBrowser() {
		  driver.close();
	  }
	 
	}
