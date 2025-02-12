package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellSoftwarePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSoftware {

	WebDriver driver;
	@Given("^user visit Dell home$")
	public void user_visit_Dell_home() throws Throwable {
		//how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		   
		  
	// how to open URL
		driver.get("https://www.dell.com/en-us");
	//maximize window	
		driver.manage().window().maximize();

	}

	@When("^user go to Computers & Accessories menu and click on Software$")
	public void user_go_to_Computers_Accessories_menu_and_click_on_Software() throws Throwable {
	  Actions act=new Actions(driver);
	  DellSoftwarePOM obj=new DellSoftwarePOM (driver);
	  act.moveToElement(obj.nav_Computers_Accessories()).build().perform();
	  Thread.sleep(5000);
	  obj.nav_Software().click();
	  
	  
	}

	@Then("^user will be redirects to  Software  page$")
	public void user_will_be_redirects_to_Software_page() throws Throwable {
	    
	}
	
}
