package com.MavenTNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.PageObjectManager;

public class TestRunner extends BaseClass {
	public WebDriver driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	@BeforeSuite
	private void launchBrowser() throws InterruptedException {
		launchBrowser("chrome");
		launchurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	@BeforeTest
	private void login() throws InterruptedException {
		inputValue(pom.getHomePageORM().getUsername(),"Admin");
		inputValue(pom.getHomePageORM().getPassword(),"admin123");
		clickOnElement(pom.getHomePageORM().getLogin());
		Thread.sleep(5000);
	}
	
	@Test
	private void addEmp() throws InterruptedException {
		clickOnElement(pom.getAddEmployee().getPim());
		Thread.sleep(5000);
		clickOnElement(pom.getAddEmployee().getAddemp());
		Thread.sleep(5000);
		inputValue(pom.getAddEmployee().getFirstname(),"Madhu");
		Thread.sleep(5000);
		inputValue(pom.getAddEmployee().getMiddlename(),"mitha");
		Thread.sleep(5000);
		inputValue(pom.getAddEmployee().getLastname(),"Ravi");
		Thread.sleep(50000);
		clickUsingJSE(pom.getAddEmployee().getCreatedetails());
		Thread.sleep(5000);
		inputValue(pom.getAddEmployee().getNewusername(),"Madhumitha");
		Thread.sleep(5000);
		inputValue(pom.getAddEmployee().getNewpassword(),"strong951");
		Thread.sleep(5000);
		inputValue(pom.getAddEmployee().getConfirmpassword(),"strong951");
		Thread.sleep(5000);
		clickOnElement(pom.getAddEmployee().getSave());
		Thread.sleep(5000);
		
		clickUsingJSE(pom.getJobDetails().getJob());
		dropDown("text",pom.getJobDetails().getJobtitle(),"chehdiuqwd");
		dropDown("text",pom.getJobDetails().getEmpstatus(),"Full-Time Permanent");
		dropDown("text",pom.getJobDetails().getSubunit(),"Administration");
		clickOnElement(pom.getJobDetails().getSave());
		Thread.sleep(5000);

		clickOnElement(pom.getEmployeeSearch().getEmplist());
		inputValue(pom.getEmployeeSearch().getEmpname(),"Madhumitha");
		dropDown("text",pom.getEmployeeSearch().getEmpstatus(),"Full-Time Permanent");
		clickOnElement(pom.getEmployeeSearch().getSearch());
		Thread.sleep(5000);
	}
	
	
//	private void validateTitle() throws InterruptedException {
//		String currenttitle = getCurrentTitle();
//		System.out.println(currenttitle);
//		Thread.sleep(5000);
//	}
	@AfterTest
	private void screenshot() throws Exception {
		scrollByValue(0,100);
		screenShot("Empdetails");
		Thread.sleep(2000);
	}
	
	@AfterSuite
	private void closeBrowser() {
		exit();
	}
}
