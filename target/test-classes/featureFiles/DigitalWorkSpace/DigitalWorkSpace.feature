Feature: DigitalWorkSpace.feature - To prepare test cases to validate Digital Workspace options

Background: 
	Given I do login with admin user
	
Scenario: Validate Digital Workspace options scenario
	And I click on AdminHQ
	And I verify AdminHQ page title
	Then I return to DigitalWorkSpace page

	And I click on UserManager button
	And I verify UserManager page title
	Then I return to DigitalWorkSpace page
	
	And I click on Queues Option
	And I verify Queues page title
	Then I return to DigitalWorkSpace page
	
	And I click on Organizational Groups Option
	And I verify Organizational Groups page title
	Then I return to DigitalWorkSpace page