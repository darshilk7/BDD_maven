package StepDefinition1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 {
	WebDriver driver;
	String title;
	@Given("^Login application should be available$")
	public void login_application_should_be_available() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("Hey Hello !");
	   
	}

	@When("^Validate login application$")
	public void validate_login_application() throws Throwable {
		title= driver.getTitle();
		System.out.println("title");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Login should be Successful$")
	public void login_should_be_Successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
