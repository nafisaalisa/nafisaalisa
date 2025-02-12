package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.dellsearchPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class dellsearch {
	
	WebDriver driver;
	
	@Given("^user visit dell home page$")
	public void user_visit_dell_home_page() throws Throwable {
		//how to open browser?
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
				  driver = new ChromeDriver();
				   
				  
			// how to open URL
				driver.get("https://www.dell.com/en-us");
	}

	@When("^user type \"([^\"]*)\" and click search icon$")
	public void user_type_and_click_search_icon(String arg1) throws Throwable {
	    dellsearchPOM dell=new dellsearchPOM(driver);
	    dell.dellsearch().sendKeys(arg1);
	    dell.searchicon().click();
	    
	    driver.manage().window().maximize();
	}

	@Then("^User will be able to redirect to the page$")
	public void user_will_be_able_to_redirect_to_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
