package com.flightbooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.HomePageORM;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private FlightLogin flightlogin;
	private FlightSearch flightsearch;
	
	public PageObjectManager(WebDriver driver1) {
		PageFactory.initElements(driver, this);
	}

	public FlightLogin getFlightLogin() {
		flightlogin = new FlightLogin(driver);
		return flightlogin;
	} 
	
	public FlightSearch getFlightSearch() {
		flightsearch = new FlightSearch(driver);
		return flightsearch;
	}
}
