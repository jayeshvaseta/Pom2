package com.demout.tour.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demout.tour.classes.FlightConfirmation;
import com.demout.tour.classes.FlightFinder;
import com.demout.tour.classes.Login;

public class Validate extends BaseClass {
	
	
	@Test
	public void valideUser() {
		
		Login ln = new Login (driver);
		FlightFinder ff = new FlightFinder(driver);
		
		ln.loginPage("mercury", "mercury");
		boolean signOffPresent = ff.getSignOff().isDisplayed();
		
		Assert.assertTrue(signOffPresent);
		
	}
	
	
	

}
