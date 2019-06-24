package com.demout.tour.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(9) > tbody > tr:nth-child(3) > td.frame_action_xrows > input[type=radio]")
    private WebElement depart;
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child(3) > td.frame_action_xrows > input[type=radio]")
	private WebElement retun;
	
	@FindBy(name="reserveFlights")
	private WebElement submit;
	
	public SelectFlight (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectFlight() {
		
		depart.click();
		retun.click();
		submit.click();
	}
}
