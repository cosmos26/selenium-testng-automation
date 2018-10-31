package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.app.beans.EmployeeBean;
import com.app.pages.DashboardPage;
import com.app.pages.PIMPage;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeStepDefinitions {
	private WebDriver driver = Driver.getDriver();
	DashboardPage dashboardPage = new DashboardPage();
	PIMPage pimPage = new PIMPage();
	
	
	@When("I click PIM page and select Add Employee from menu")
	public void i_click_PIM_page_and_select_Add_Employee_from_menu() {
	    dashboardPage.PIM.click();
		pimPage.addEmployeeButton.click();
		
	}
	@When("I add a new employee:")
	public void i_add_a_new_employee(List<EmployeeBean> employees) {
		EmployeeBean employeeBean = employees.get(0);
		
		pimPage.firstname.sendKeys(employeeBean.getFirstname());
		pimPage.firstname.sendKeys(employeeBean.getLastname());
		pimPage.firstname.sendKeys(employeeBean.getEmployeeid());
	}

	

	@When("add employee picture and click Save")
	public void add_employee_picture_and_click_Save() {
	   
		pimPage.uploadPhoto.click();
		// upload file code should be here
		pimPage.saveButton.click();
		
		
	}

	@Then("Verify Personal Details page includes employee name")
	public void verify_Personal_Details_page_includes_employee_name() {
		EmployeeBean employeeBean = new EmployeeBean();
		assertEquals(pimPage.personalFullName, employeeBean.getFirstname());
	}

	@Then("I click Employee List from the menu")
	public void i_click_Employee_List_from_the_menu() {
	    pimPage.employeeList.click();
	    
	    
	}

	@Then("Verify <firstname> ,<lastname> , <employeeid> matchess")
	public void verify_firstname_lastname_employeeid_matchess() {
		//Use bean class and put data into List<EmployeeBean>
		//Collect data from table
		//assertion
	}
	
	
}
