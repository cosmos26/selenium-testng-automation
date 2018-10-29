package com.app.step_definitions;


import org.openqa.selenium.WebDriver;

import com.app.pages.DashboardPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.java.en.When;

public class LogoutStepDefinitions {
	private WebDriver driver = Driver.getDriver();
	DashboardPage dashboardPage = new DashboardPage();
	
	
	@When("I can click logout")
	public void i_can_click_logout() {
	 
		dashboardPage.welcomeAdmin.click();
		BrowserUtils.waitForVisibility(dashboardPage.logoutButton, 1);
		
		dashboardPage.logoutButton.click();
		
		
		
	}
	
}
