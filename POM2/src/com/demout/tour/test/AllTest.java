package com.demout.tour.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demout.tour.classes.BookFlight;
import com.demout.tour.classes.FlightConfirmation;
import com.demout.tour.classes.FlightFinder;
import com.demout.tour.classes.Login;
import com.demout.tour.classes.SelectFlight;

public class AllTest extends BaseClass {
	
	
	
	@Test
	 public void flightBooking() {
		Login ln = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookFlight bf = new BookFlight(driver);
		FlightConfirmation fc = new FlightConfirmation(driver);
		
		ln.loginPage("mercury", "mercury");
		ff.FindFlight();
		sf.selectFlight();
		bf.bookFlight("jv", "vj", "12345689");
		
		String expectedMssg = "Your itinerary has been booked!";
		String actualMssg = fc.mssg().getText();
		
		Assert.assertEquals(actualMssg, expectedMssg);
		
	}
	
	
	
	

}
