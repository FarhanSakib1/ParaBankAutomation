package com.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class StepDefinition {
	WebDriver driver;
	MasterPageFactory mpf; 
	DriverManager dm;
	@Given("The browser is open")
	public void the_browser_is_open() {
		 dm = new DriverManager();
		 driver = dm.getChromeDriver(driver);
	    
	}

	@Given("Pass the Parabank URL {string}")
	public void pass_the_parabank_url(String URL) {
	    driver.navigate().to(URL);
	    mpf = new MasterPageFactory(driver);
	}

	@Given("Enter Username in username Field {string}")
	public void enter_username_in_username_field(String Username) {
	    mpf.getUsername().sendKeys(Username);
	    
	}

	@Given("Enter Password in password field {string}")
	public void enter_password_in_password_field(String Password) {
	    mpf.getPassword().sendKeys(Password);
	    
	}

	@Then("Click on login button")
	public void click_on_login_button() {
	    mpf.getLogin_btn().click();
	    
	}

	@Then("Validate Login is successful")
	public void validate_login_is_successful() {
	    Assert.assertTrue(mpf.getLogout().isDisplayed(), "Logout Successful!");
	    
	}

	@Then("Quit the browser")
	public void quit_the_browser() {
	    driver.quit();
	    
	}
}
