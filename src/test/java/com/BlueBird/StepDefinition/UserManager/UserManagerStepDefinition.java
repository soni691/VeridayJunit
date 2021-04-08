package com.BlueBird.StepDefinition.UserManager;



import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.Helper.PropertyHelper;
import com.BlueBird.PageObjects.Login.LoginPage;
import com.BlueBird.PageObjects.UserManager.UserManager;
import com.BlueBird.Util.Constants;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserManagerStepDefinition {
	
	private UserManager usermanagerPage;
	/**
	 * Instantiates a new login step definition.
	 *
	 * @param testContext
	 *            the test context
	 */
	public UserManagerStepDefinition(TestContext testContext) {
		usermanagerPage = testContext.getUserManagerPage();
	}
	
	@And("^I click on User Manager option$")
	public void i_click_on_User_Manager_option() throws Throwable {
		usermanagerPage.clickonUserManager();		
	}

	@And("^I click on Create Single User button$")
	public void i_click_on_Create_Single_User_button() throws Throwable {
		usermanagerPage.clickonCreateSingleUser();
	    
	}

	@And("^I enter Account Email$")
	public void i_enter_Account_Email() throws Throwable {
	   usermanagerPage.enterAccountEmail();
	    
	}

	@And("^I enter First Name$")
	public void i_enter_First_Name() throws Throwable {
		usermanagerPage.enterFirstName();
	    
	}

	@And("^I enter Last Name$")
	public void i_enter_Last_Name() throws Throwable {
		usermanagerPage.enterLastName();
	    
	}

	@And("^I enter JobTitle1$")
	public void i_enter_JobTitle1() throws Throwable {
		usermanagerPage.enterJobTitle1();
	    
	}
	@And("^I enter JobTitle2$")
	public void i_enter_JobTitle2() throws Throwable {
		usermanagerPage.enterJobTitle2();
	    
	}

	@And("^I enter Location$")
	public void i_enter_Location() throws Throwable {
		usermanagerPage.enterLocation();
	    
	}

	@And("^I enter PhoneNumber$")
	public void i_enter_PhoneNumber() throws Throwable {		
		usermanagerPage.enterPhone();
	}
	
	@And("^I enter StateRegistration$")
	public void i_enter_StateRegistration() throws Throwable {		
		usermanagerPage.enterPLincense();
	}
	

	@And("^I click on Save&Activate button$")
	public void i_click_on_Save_Activate_button() throws Throwable {
		usermanagerPage.clickSave();
	    
	}

	@Then("^A new Primary User is created$")
	public void A_new_Primary_User_is_created() throws Throwable {
		System.out.println("User is CReated");
	    
	}

}
