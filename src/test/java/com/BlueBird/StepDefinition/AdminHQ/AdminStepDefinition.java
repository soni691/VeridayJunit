package com.BlueBird.StepDefinition.AdminHQ;

import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.PageObject.adminHQ.AdminHQ;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDefinition {
	
	private AdminHQ adminhqpage;
	
	public AdminStepDefinition(TestContext testContext) {
		adminhqpage = testContext.getadminHQPage();
	}
	
	@And("^I click on AdminHQ button$")
	public void i_click_on_AdminHQ_button() throws Throwable {
		adminhqpage.clickonAdminHQ();
	}

	@Then("^I verify HubManager option$")
	public void i_verify_HubManager_option() throws Throwable {
		adminhqpage.validateHubManager();
	}
	
	@And("^I click on Global Settings option$")
	public void i_click_on_Global_Settings_option() throws Throwable {
	    adminhqpage.clickongSetting();
	}

	@Then("^I verify Global Settings option$")
	public void i_verify_Global_Settings_option() throws Throwable {
	    adminhqpage.validateGlobalSetting();
	}

	@And("^I click on Email Template option$")
	public void i_click_on_Email_Template_option() throws Throwable {
	   adminhqpage.clickonETemplate();
	}

	@Then("^I verify Email Template option$")
	public void i_verify_Email_Template_option() throws Throwable {
	    adminhqpage.validateEmailTemplate();
	}

	@And("^I click on Maintenace option$")
	public void i_click_on_Maintenace_option() throws Throwable {
	   adminhqpage.clickonMaintenance();
	}

	@Then("^I verify Maintenace option$")
	public void i_verify_Maintenace_option() throws Throwable {
	   adminhqpage.validateMaintenance();
	}

}
