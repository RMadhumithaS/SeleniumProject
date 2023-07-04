package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenTNG.BaseClass;

public class HomePageORM extends BaseClass {
	
	public WebDriver driver;
	
	public HomePageORM(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	
}
