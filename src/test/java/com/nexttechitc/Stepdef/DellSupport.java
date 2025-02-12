package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellSupportPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSupport {

	WebDriver driver;
	@Given("^user visit Dell home page$")
	public void user_visit_Dell_home_page() throws Throwable {
		//how to open browser?
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
				  driver = new ChromeDriver();
				   
				  
			// how to open URL
				driver.get("https://www.dell.com/en-us");
				
				driver.manage().window().maximize();
 
		
		
	}

	@When("^user go to Support menu and click on Support home$")
	public void user_go_to_Support_menu_and_click_on_Support_home() throws Throwable {
	   Actions act=new Actions(driver);
	   DellSupportPOM obj=new DellSupportPOM(driver);
	   act.moveToElement(obj.nav_Support()).build().perform();
	   Thread.sleep(5000);
	   obj.nav_Support_home().click();
	}

	@Then("^user will be redirects to Support home page$")
	public void user_will_be_redirects_to_Support_home_page() throws Throwable {
	    
	}
	
}
