Feature: Add an Employee
 As an Hr director of the company I want to add my employee profile using my credentials and verify it in the emp List

 Background: User navigates to Company home page
   Given I am on the "Company home" page on URL "URL"
   Then I login with "username" and "password"

 Scenario: Successful login
   When I click PIM page and select Add Employee from menu
   And I fill in "First Name" with "John"
   And I fill in "Last Name" with "Batman" and employeed id "007"
   And add employee picture and click Save
   Then Verify Personal Details page includes employee name
   And I click Employee List from the menu
  Then Verify "First Name" ,"Last Name" , employee id matchess