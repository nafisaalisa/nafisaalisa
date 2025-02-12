package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellActionviewallservicePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellActionviewallservice {
 
	WebDriver driver;
	
	@Given("^user visits Dell home page$")
	public void user_visits_Dell_home_page() throws Throwable {
		//how to open browser?
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
		   
		  
	// how to open URL
		driver.get("https://www.dell.com/en-us");
		
		driver.manage().window().maximize();

	}

	@When("^user go to service menu and click on  View All service$")
	public void user_go_to_service_menu_and_click_on_View_All_service() throws Throwable {
	    Actions act=new Actions(driver);
	    DellActionviewallservicePOM obj=new DellActionviewallservicePOM(driver);
	    act.moveToElement(obj.nav_service()).build().perform();
	    Thread.sleep(5000);
	    obj.nav_Allservice().click();
	    
	    
	}

	@Then("^user redirects to view all service page$")
	public void user_redirects_to_view_all_service_page() throws Throwable {
	    
	}
	
	
	
}
