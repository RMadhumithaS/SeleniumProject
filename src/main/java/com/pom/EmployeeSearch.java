package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeSearch {
	
	public WebDriver driver;
	
	public EmployeeSearch(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement emplist;

	public WebElement getEmplist() {
		return emplist;
	}

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input" )
	private WebElement empname;
	
	public WebElement getEmpname() {
		return empname;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div")
	private WebElement empstatus;
	
	public WebElement getEmpstatus() {
		return empstatus;
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}

}
