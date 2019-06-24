package com.demout.tour.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(name="userName")
	private WebElement UserName;
	
	@FindBy(name="password")
	private WebElement Pass;
	
	@FindBy(name="login")
	private WebElement submit;
	
	public Login (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginPage(String un, String pw) {
		
		UserName.sendKeys(un);
		Pass.sendKeys(pw);
		submit.click();
	}
	
	
	
	
	
}
