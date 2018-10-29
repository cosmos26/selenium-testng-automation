package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.app.pages.LoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.*;

public class LoginStepDefinitions {
	private WebDriver driver = Driver.getDriver();
	LoginPage loginPage = new LoginPage();

	@Given("^I go to OrangeHRM$")
	public void i_go_to_OrangeHRM() throws Throwable {
		driver.get(ConfigurationReader.getProperty("url"));
	}

	@When("^I go to OrangeHRM, page title should be \"([^\"]*)\"$")
	public void i_go_to_OrangeHRM_page_title_should_be(String arg1) throws Throwable {
		assertEquals(driver.getTitle(), arg1);
	}

	@Then("^Logo should be visible$")
	public void logo_should_be_visible() throws Throwable {
		assertTrue(loginPage.logo.isDisplayed());
	}

	@Then("^I login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_with_and(String arg1, String arg2) throws Throwable {
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.login_button.click();
	}
}
