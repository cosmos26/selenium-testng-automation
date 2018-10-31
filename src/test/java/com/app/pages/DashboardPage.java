package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class DashboardPage {
	private WebDriver driver;

	public DashboardPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='welcome']")
	public WebElement welcomeAdmin;
	
	@FindBy(xpath="//*[@id='welcome-menu']/ul/li[2]/a")
	public WebElement logoutButton;
	
	@FindBy(xpath="//*[@id='aboutDisplayLink']")
	public WebElement aboutButton;
	
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']")
	public WebElement PIM;
}
