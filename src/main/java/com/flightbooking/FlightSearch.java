package com.flightbooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenTNG.BaseClass;

public class FlightSearch extends BaseClass  {
	
	public WebDriver driver;
	
	
	public FlightSearch(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Round-trip']")
	private WebElement roundtrip;
	
	public WebElement getRoundtrip() {
		return roundtrip;
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/input")
	private WebElement from;
	
	public WebElement getFrom() {
		return from;
	}
	
	@FindBy(xpath = "/	html/body/div[1]/div[3]/div/div/div[1]/div[2]/div/div[2]/div/input")
	private WebElement to;
	
	public WebElement getTo() {
		return to;
	}
	
	@FindBy(xpath = "//div[@aria-label='Mon Jul 10 2023']")
	private WebElement departuredate;
	
	public WebElement getDeparturedate() {
		return departuredate;
	}
	
	
	@FindBy(xpath = "//span[text()='Return']")
	private WebElement comeback;
	
	public WebElement getComeback() {
		return comeback;
	}
	
	@FindBy(xpath = "//div[@aria-label='Thu Jul 20 2023']")
	private WebElement returnDate;
	
	public WebElement getReturnDate() {
		return returnDate;
	}
	
	@FindBy(xpath = "//span[text()='Done']")
	private WebElement done;
	
	public WebElement getDone() {
		return done;
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[1]/div/span[3]/svg/path")
	private WebElement adultincrease;
	
	public WebElement getAdultincrease() {
		return adultincrease;
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[2]/div/span[3]/svg/path")
	private WebElement childincrease;
	
	public WebElement getChildincrease() {
		return childincrease;
	}
	
	@FindBy(xpath = "//a[text()='Done']")
	private WebElement done1;
	
	public WebElement getDone1() {
		return done1;
	}
	
	@FindBy(xpath = "//span[text()='SEARCH FLIGHTS']")
	private WebElement searchflight;
	
	public WebElement getSearchflight() {
		return searchflight;
	}
}
