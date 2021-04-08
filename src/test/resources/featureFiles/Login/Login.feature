Feature: Login.feature - To prepare test cases for login scenario for BlueBird

Background: 
	Given the web application is open

Scenario: Test login with admin user valid and invalid scenario
	Given I am on the login page of the application
	
#	When I enter wrong admin user name
#	And I enter wrong admin password
#	And I click on login button
	
	When I enter admin user name
	And I enter admin password
	And I click on login button
	Then I should be logged in as an admin user

