package com.demout.tour.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlight {

	@FindBy(name="passFirst0")
	private WebElement fn;
	
	@FindBy(name="passLast0")
	private WebElement ln;
	
	@FindBy(name="creditnumber")
	private WebElement cc;
	
	@FindBy(name="buyFlights")
	private WebElement submit;
	
	public BookFlight (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void bookFlight(String pass, String last, String cn) {
		fn.sendKeys(pass);
		ln.sendKeys(last);
		cc.sendKeys(cn);
		submit.click();
		
	}
	
}
