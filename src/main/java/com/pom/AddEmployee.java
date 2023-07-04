package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenTNG.BaseClass;

public class AddEmployee extends BaseClass{
	
	public WebDriver driver;
	
	public AddEmployee(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim;
	
	public WebElement getPim() {
		return pim;
	}
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addemp;
	
	public WebElement getAddemp() {
		return addemp;
	}
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstname;
	
	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middlename;
	
	public WebElement getMiddlename() {
		return middlename;
	}
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastname;
	
	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement createdetails;
	
	public WebElement getCreatedetails() {
		return createdetails;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")
	private WebElement newusername;

	public WebElement getNewusername() {
		return newusername;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")
	private WebElement newpassword;
	
	public WebElement getNewpassword() {
		return newpassword;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")
	private WebElement confirmpassword;
	
	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;	

	public WebElement getSave() {
		return save;
	}
}
