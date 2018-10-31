Feature: Add an Employee
 As an Hr director of the company I want to add my employee profile using my credentials and verify it in the emp List

 Background: User navigates to Company home page
   Given I go to OrangeHRM
   Then I login with "username" and "password"

 @AddEmployeeTests
 Scenario: Successful login
   When I click PIM page and select Add Employee from menu
   And I add a new employee:
   |<firstname>|<lastname>|<employeeid>|
   |"John"|"Batman"|"0321"|
   And add employee picture and click Save
   Then Verify Personal Details page includes employee name
   And I click Employee List from the menu
  Then Verify <firstname> ,<lastname> , <employeeid> matchess
  
  Scenario Outline:
  