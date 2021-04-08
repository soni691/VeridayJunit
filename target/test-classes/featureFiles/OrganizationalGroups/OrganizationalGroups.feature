Feature: OrganizationalGroups.feature - To prepare test cases to create new Group,Region & Branch

Background: 
	Given I do login with admin user

Scenario: Create new Group scenario
	And I click on Organizational Groups option
	And I click on New button
	And I click on Group button
	And I enter Group name
	And I click on SaveChanges button
	
	Then a New Group is created
	
	When I click on New button
	And I click on Region button
	And I enter Region name
	And I enter Region Addressline1
	And I enter Region Addressline2
	And I enter Region City
	And I enter Region State
	And I enter Region ZIP
	And I enter Region Country
	And I click on SaveChanges button
	
	Then a New Region is created
	
	When I click on New button
	And I click on Branch button
	And I enter Branch name
	And I enter Branch Addressline1
	And I enter Branch Addressline2
	And I enter Branch City
	And I enter Branch State
	And I enter Branch ZIP
	And I enter Branch Country
	And I click on SaveChanges button
	
	Then a New Branch is created
	
	And I select Stored Group Name
	And I click on Edit button
	And I click on Attribute dropdown
	And I click on SaveChanges button
	
	Then a group is updated
	
	And I select Stored Region Name
	And I click on Edit button
	And I enter Region Addressline1
	And I enter Region Addressline2
	And I enter Region City
	And I enter Region State
	And I enter Region ZIP
	And I enter Region Country
	And I click on SaveChanges button
	
	Then a region is updated
	
	And I select Stored Branch Name
	And I click on Edit button
	And I enter Branch Addressline1
	And I enter Branch Addressline2
	And I enter Branch City
	And I enter Branch State
	And I enter Branch ZIP
	And I enter Branch Country
	And I click on SaveChanges button
	
	Then a branch is updated
	
#Scenario: Create new Region scenario
#	And I click on Organizational Groups option
#	And I select Stored Group Name
#	When I click on New button
#	And I click on Region button
#	And I enter Region name
#	And I enter Region Addressline1
#	And I enter Region Addressline2
#	And I enter Region City
#	And I enter Region State
#	And I enter Region ZIP
#	And I enter Region Country
#	And I click on SaveChanges button
#	
#	Then a New Region is created
	
#Scenario: Create new Branch scenario
#	And I click on Organizational Groups option
#	And I select Stored Group Name
#	When I click on New button
#	And I click on Branch button
#	And I enter Branch name
#	And I enter Branch Addressline1
#	And I enter Branch Addressline2
#	And I enter Branch City
#	And I enter Branch State
#	And I enter Branch ZIP
#	And I enter Branch Country
#	And I click on SaveChanges button
#	
#	Then a New Branch is created
	
#Scenario: Update an existing Group scenario
#	And I click on Organizational Groups option
#	And I select Stored Group Name
#	And I click on Edit button
#	And I click on Attribute dropdown
#	And I click on SaveChanges button
#	
#	Then a group is updated
#
#Scenario: Update an existing Region scenario
#	And I click on Organizational Groups option
#	And I select Stored Region Name
#	And I click on Edit button
#	And I enter Region Addressline1
#	And I enter Region Addressline2
#	And I enter Region City
#	And I enter Region State
#	And I enter Region ZIP
#	And I enter Region Country
#	And I click on SaveChanges button
#	
#	Then a region is updated