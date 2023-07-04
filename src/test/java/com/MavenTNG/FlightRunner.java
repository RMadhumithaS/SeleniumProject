package com.MavenTNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.flightbooking.PageObjectManager;


public class FlightRunner {

	public class TestRunner extends BaseClass {
		public WebDriver driver;
		PageObjectManager pom = new PageObjectManager(driver);
		
		@BeforeSuite
		private void launchBrowser() throws InterruptedException {
			launchBrowser("chrome");
			launchurl("https://www.goibibo.com/");
			Thread.sleep(50000);
		}

		@BeforeMethod
		private void login() throws InterruptedException {
			inputValue(pom.getFlightLogin().getPhonenum(),"7358166889");
			Thread.sleep(5000);
			clickOnElement(pom.getFlightLogin().getClickCont());
			Thread.sleep(5000);
			System.out.println("Success");
		}
		
		@Test
		private void FlightSearch() throws AWTException {
			clickOnElement(pom.getFlightSearch().getRoundtrip());
			clickOnElement(pom.getFlightSearch().getFrom());
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			clickOnElement(pom.getFlightSearch().getTo());
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			clickOnElement(pom.getFlightSearch().getDeparturedate());
			clickOnElement(pom.getFlightSearch().getComeback());
			clickOnElement(pom.getFlightSearch().getReturnDate());
			clickOnElement(pom.getFlightSearch().getDone());
			clickOnElement(pom.getFlightSearch().getAdultincrease());
			clickOnElement(pom.getFlightSearch().getChildincrease());
			clickOnElement(pom.getFlightSearch().getDone1());
			clickOnElement(pom.getFlightSearch().getSearchflight());			
		}
		
		@AfterSuite
		private void closeBrowser() {
			exit();
		}
	}	
}
