package com.flightbooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenTNG.BaseClass;

public class FlightLogin extends BaseClass {
	
	public WebDriver driver;
	
	public FlightLogin(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "//input[@class='loginCont__input']")
	private WebElement phonenum;
	
	public WebElement getPhonenum() {
		return phonenum;
	}
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement clickCont;

	public WebElement getClickCont() {
		return clickCont;
	}
}
