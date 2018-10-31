package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class PIMPage {
	
	private WebDriver driver;
		
	 public PIMPage() {
		 this.driver=Driver.getDriver();
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id='menu_pim_addEmployee']")
	 public WebElement addEmployeeButton;
	 
	 @FindBy(xpath="//*[@id='firstName']")
	 public WebElement firstname;
	 
	 @FindBy(xpath="//*[@id='middleName']")
	 public WebElement middlename;
	 
	 @FindBy(xpath="//*[@id='lastName']")
	 public WebElement lastname;
	
	 @FindBy(xpath="//*[@id='employeeId']")
	 public WebElement employeeId;
	
	 @FindBy(xpath="//*[@id='photofile']")
	 public WebElement uploadPhoto;

	 @FindBy(xpath="//*[@id='btnSave']")
	 public WebElement saveButton;
	 
	 @FindBy(xpath="//*[@id='personal_txtEmpFirstName']")
	 public WebElement personalFirstName;
	 
	 @FindBy(xpath="//*[@id='personal_txtEmpLastName']")
	 public WebElement personalLastName;
	 
	 @FindBy(xpath="//*[@id='personal_txtEmployeeId']")
	 public WebElement personalEmployeeId;
	 
	 @FindBy(xpath="//*[@id='profile-pic']/h1")
	 public WebElement personalFullName;
	 
	 @FindBy(xpath="//*[@id='menu_pim_viewEmployeeList']")
	 public WebElement employeeList;
}
