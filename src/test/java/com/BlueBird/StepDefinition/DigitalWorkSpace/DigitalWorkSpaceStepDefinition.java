package com.BlueBird.StepDefinition.DigitalWorkSpace;

import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.PageObjects.DigitalWorkSpace.DigitalWorkSpace;
import com.BlueBird.PageObjects.OrganizationGroups.OrganizationalGroups;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DigitalWorkSpaceStepDefinition {
	
	private DigitalWorkSpace dworkspacepage;
	
	public DigitalWorkSpaceStepDefinition(TestContext testContext) {
		dworkspacepage = testContext.getDigitalWorkspacePage();
	}
	
	@And("^I click on AdminHQ$")
	public void i_click_on_AdminHQ() throws Throwable {
		dworkspacepage.clickonAdminHQ();
	}
	
	@And("^I verify AdminHQ page title$")
	public void i_verify_AdminHQ_page_title() throws Throwable {
		dworkspacepage.clickonsearchHub();
		dworkspacepage.verifyadminhqPageTile();
	}

	@Then("^I return to DigitalWorkSpace page$")
	public void i_return_to_DigitalWorkSpace_page() throws Throwable {
		dworkspacepage.clickonodworkspace();
	}

	@And("^I click on UserManager button$")
	public void i_click_on_UserManager_button() throws Throwable {
		dworkspacepage.clickonusermanager();
	}

	@And("^I verify UserManager page title$")
	public void i_verify_UserManager_page_title() throws Throwable {
		dworkspacepage.clickonsearchUser();
		dworkspacepage.verifyUsermanagerPageTile();
	}

	@And("^I click on Queues Option$")
	public void i_click_on_Queues_Option() throws Throwable {
		dworkspacepage.clickonqueues();
	}

	@And("^I verify Queues page title$")
	public void i_verify_Queues_page_title() throws Throwable {
		dworkspacepage.clickonsearchQueue();
		dworkspacepage.verifyQueuesPageTile();
	}

	@And("^I click on Organizational Groups Option$")
	public void i_click_on_Organizational_Groups_Option() throws Throwable {
		dworkspacepage.clickonogroups();
	}

	@And("^I verify Organizational Groups page title$")
	public void i_verify_Organizational_Groups_page_title() throws Throwable {
		dworkspacepage.clickonNew();
		dworkspacepage.verifyOgroupsPageTile();
	}
}
