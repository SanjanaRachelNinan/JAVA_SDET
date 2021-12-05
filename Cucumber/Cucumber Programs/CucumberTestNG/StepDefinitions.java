package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	WebDriver driver =null;
	@Before
	public void doBefore() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb423\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@After
	public void doAfter() {
		driver.close();
	}
	@Given("the user navigates to {string}")
	public void the_user_navigates_to(String Url) {
		 
		 driver.get(Url);
	}

	@When("Enter email {string} in {string} and password {string} in {string}")
	public void enter_email_and_password(String email, String name1,String password, String name) {
		 
		  driver.findElement(By.name(name1)).sendKeys(email); 
		  driver.findElement(By.name(name)).sendKeys(password);
	}

	@When("Enter confirm password {string}")
	public void enter_confirm_password(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@When("click on {string}")
	public void click_on(String string) {
		 driver.findElement(By.name(string)).click();
	}

	@Then("verify {string} is displayed")
	public void verify_is_displayed(String string) {
	    boolean warning = driver.findElement(By.xpath(string)).isDisplayed();
	    Assert.assertEquals(warning, true);
	    }
	@Then("verify {string} by linktext is displayed")
	public void verify_by_linktext_is_displayed(String linktext) {
		 boolean warning = driver.findElement(By.linkText(linktext)).isDisplayed();
		    Assert.assertEquals(warning, true);
		    }
	
	@Then("check select {string}")
	public void check_select(String xpath) {
		 List<WebElement> options = driver.findElements(By.xpath(xpath));
		 for(int i=0;i<options.size();i++) {
			  options.get(i).click();
			  boolean isSelc = options.get(i).isSelected();
			  Assert.assertEquals(isSelc, true);
		  }
		    }
	
	@Then("check menu {string} with titles {string}")
	public void check_menu(String linktexts,String titles) {
		String[] linktext = linktexts.split(",");
		String[] title =titles.split(",");
		for(int i=0;i<linktext.length;i++) {
			driver.findElement(By.linkText(linktext[i])).click();
			String actual = driver.getTitle();
			Assert.assertEquals(actual, title[i]);
		    }
	}
	
	@Then("Checks Color of Text in Navigation Bar")
	public void checks_color_of_text_in_navigation_bar() {
		for(int i=1;i<4;i++)
		{
			String xpath ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td["+i+"]/a";
			WebElement navElement = driver.findElement(By.xpath(xpath));
			String e=navElement.getCssValue("color");
			String[] numbers = e.replace("rgba(", "").replace(")", "").split(",");
			int r = Integer.parseInt(numbers[0].trim());
			int g = Integer.parseInt(numbers[1].trim());
			int b = Integer.parseInt(numbers[2].trim());
			System.out.println("r: " + r + "g: " + g + "b: " + b );
			String textcolor = String.format("#%02x%02x%02x", r,g,b);
			Assert.assertEquals("#0000ee", textcolor);
			System.out.println("* The Color of the text in Navigation Bar is Checked *");
			
		}
	}
		@Then("Checks Background Color of SideBar")
		public void checks_background_color_of_sidebar() {
			String e=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]")).getAttribute("bgcolor");
			Assert.assertEquals("#003366", e);
			System.out.println("* The Background Color of Side Bar is Checked *");
		}
		@Then("Checks Border Color of SideBar")
		public void checks_border_color_of_sidebar() {
			String e=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table")).getAttribute("bordercolor");
			Assert.assertEquals("#000000", e);
			System.out.println("* The Border Color of SideBar is Checked *");
		}
		@Then("Checks Border Color of Navigation Bar")
		public void checks_border_color_of_navigation_bar() {
			String e=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table")).getAttribute("bordercolor");
			Assert.assertEquals("#000000", e);
			System.out.println("* The Border Color of Navigation Bar is Checked *");
		}
		
		@Then("the user clicks on each link on side bar")
		public void the_user_clicks_on_each_link_on_side_bar() {
		   
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
	}
	

