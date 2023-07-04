package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenTNG.BaseClass;

public class JobDetails extends BaseClass {
	
public WebDriver driver;
	
	public JobDetails(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Job']")
	private WebElement job;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div")
	private WebElement jobtitle; 
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div")
	private WebElement subunit;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[7]/div/div[2]/div/div/div[1]")
	private WebElement empstatus;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;

	public WebElement getJob() {
		return job;
	}

	public WebElement getJobtitle() {
		return jobtitle;
	}

	public WebElement getSubunit() {
		return subunit;
	}

	public WebElement getEmpstatus() {
		return empstatus;
	}

	public WebElement getSave() {
		return save;
	}
	
	
}
