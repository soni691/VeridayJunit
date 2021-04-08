Feature: UserManager.feature - To prepare test cases to create new Primary User
Background: 
	Given the web application is open
	

Scenario: Create new Primary User scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	When I click on User Manager option
	And I click on Create Single User button
	And I enter Account Email
	And I enter First Name
	And I enter Last Name
	And I enter JobTitle1
	And I enter JobTitle2
	And I enter StateRegistration
	And I enter Location
	And I enter PhoneNumber
	And I click on Save&Activate button
	
	Then A new Primary User is created