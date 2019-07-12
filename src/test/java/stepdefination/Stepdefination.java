package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;


	
	
	    public class Stepdefination {
		@Before
		public void tetssetup() {
			
		}
		@After
        public void testfinish() {
			driver.quit();
		}
		WebDriver driver;

	    @Given("^user navigate homepage$")
	    public void user_navigate_homepage() throws Throwable {
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			
	        
	    }

	   
	    
	    
	    
	    
	    
	    
	
	
	    
	    
	    
	    
	    //data driver
	    
	 
	    




	    @When("^enter   first name \"([^\"]*)\"$")
	    public void enter_first_name(String arg1) throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys(arg1);
	    }

	    @When("^enter   last name \"([^\"]*)\"$")
	    public void enter_last_name(String arg1) throws Throwable {
	    	driver.findElement(By.name("lastname")).sendKeys(arg1);
	    }

	    @When("^enter   password \"([^\"]*)\"$")
	    public void enter_password(String arg1) throws Throwable {
	    	driver.findElement(By.name("reg_passwd__")).sendKeys(arg1);
	    }

	    
	    
	    

@When("^I want to enter firstname \"([^\"]*)\" as name$")
public void i_want_to_enter_firstname_as_name(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).sendKeys(arg1);

}

@When("^I want to enter lastname \"([^\"]*)\" as name$")
public void i_want_to_enter_lastname_as_name(String arg1) throws Throwable {
	driver.findElement(By.name("lastname")).sendKeys(arg1);
 
}

@Then("^I  want to enter password \"([^\"]*)\" as pass$")
public void i_want_to_enter_password_as_pass(String arg1) throws Throwable {
	driver.findElement(By.name("reg_passwd__")).sendKeys(arg1);
   
}

	 

	}



