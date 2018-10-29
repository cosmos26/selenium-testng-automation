package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	public WebElement login_button;
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	public WebElement logo;
}
