package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.MavenTNG.BaseClass;

public class PageObjectManager extends BaseClass {
		
	private HomePageORM homepage;
	private AddEmployee addemployee;
	private JobDetails jobdetails;
	private EmployeeSearch employeesearch;
	
	public PageObjectManager(WebDriver driver1) {
		PageFactory.initElements(driver, this);
	}
	
	public HomePageORM getHomePageORM() {
		homepage = new HomePageORM(driver);
		return homepage;
	}
	
	public AddEmployee getAddEmployee() {
		addemployee = new AddEmployee(driver);
		return addemployee;
	}
	
	public JobDetails getJobDetails() {
		jobdetails = new JobDetails(driver);
		return jobdetails;
	}
	
	public EmployeeSearch getEmployeeSearch() {
		employeesearch = new EmployeeSearch(driver);
		return employeesearch;
	}
}
