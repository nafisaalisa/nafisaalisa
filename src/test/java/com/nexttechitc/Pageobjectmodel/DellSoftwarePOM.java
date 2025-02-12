package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSoftwarePOM {
   
	WebDriver driver;
	public DellSoftwarePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/button/span")
	WebElement Computers_Accessories;
	public WebElement nav_Computers_Accessories() {
		return Computers_Accessories ;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[10]/a")
	WebElement Software;
	public WebElement nav_Software() {
		return Software;
	}
	
}