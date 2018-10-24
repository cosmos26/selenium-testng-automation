Feature: Login with valid username and password

 
  Scenario: User can login
    Given I go to OrangeHRM
    When I go to OrangeHRM, page title should be "OrangeHRM"
    Then Logo should be visible
    Then I login with "username" and "password"
