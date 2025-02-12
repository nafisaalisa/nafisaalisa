package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSupportPOM {
    
	public DellSupportPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/button/span")
	WebElement nav_Support;
	public WebElement nav_Support() {
		return nav_Support;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/a")
	WebElement nav_Support_home;
	public WebElement nav_Support_home() {
		return nav_Support_home;
	}
	
	
	
	
	
	
	
	
}
