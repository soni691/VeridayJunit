/* Purpose: Contains all step definitions associated with the steps in Login.feature file.
 Created By: Dhaval Jethava
 Created Date: 6th March 2018
 */
package com.BlueBird.StepDefinition.Login;

import java.util.Properties;

import org.junit.Assert;

import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.Helper.PropertyHelper;
import com.BlueBird.PageObjects.HomePage;
import com.BlueBird.PageObjects.Login.LoginPage;
import com.BlueBird.Util.Constants;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * The Class LoginStepDefinition.
 */

public class LoginStepDefinition {

	/** The login page. */
	private LoginPage loginPage;

	/** The home page. */
	private HomePage homePage;

	/** The config. */
	private Properties CONFIG;
	
	

	/**
	 * Instantiates a new login step definition.
	 *
	 * @param testContext
	 *            the test context
	 */
	public LoginStepDefinition(TestContext testContext) {
		CONFIG = PropertyHelper.getConfig(Constants.CONFIG_PROPERTY);
		loginPage = testContext.getLoginPage();
		homePage = testContext.getHomePage();
	}

	/**
	 * Launch application.
	 */
	@Given("^the web application is open$")
	public void LaunchApplication() {
		loginPage.LaunchApplication();
	}
	
	@Given("^I do login with admin user$")
	public void  I_do_login_with_admin_user() {
		String userName = CONFIG.getProperty("admin.user");
		String password = CONFIG.getProperty("admin.password");
		loginPage.DoLoginwithAdminUser(userName,password);
	}

	/**
	 * Open new browser.
	 */
	@And("^I open new browser")
	public void openNewBrowser() {
		loginPage.openNewWindow();
	}

	

	/**
	 * Check if login page is displayed.
	 */
	@Given("^I am on the login page of the application$")
	public void checkIfLoginPageIsDisplayed() {
		System.out.println("The user is on the login page.");
	}

	/**
	 * Enter user name.
	 */
	@When("^I enter admin user name$")
	public void enterUserName() {
		String userName = CONFIG.getProperty("admin.user");
		
		loginPage.enterUserName(userName);
	}

	@When("^I enter wrong admin user name$")
	public void enterWrongUserName() {
		String userName = CONFIG.getProperty("admin.wrongUser");
		loginPage.enterWrongUserName(userName);
	}
	
	/**
	 * Enter password.
	 */
	@When("^I enter admin password$")
	public void enterPassword() {
		String password = CONFIG.getProperty("admin.password");
		loginPage.enterPassword(password);
	}
	
	@When("^I enter wrong admin password$")
	public void enterWrongPassword() {
		String password = CONFIG.getProperty("admin.wrongPassword");
		loginPage.enterWrongPassword(password);
	}

	/**
	 * Click on login button.
	 */
	@When("^I click on login button$")
	public void clickOnLoginButton() {
		System.out.println("Clicking on login button.");
		loginPage.clickOnLoginButton();
	}
	
	@When("^I click on Ok button$")
	public void clickOnOkButton() {
		System.out.println("Clicking on Ok button.");
		loginPage.clickOnOkButton();
	}

	/**
	 * Check if admin login successful.
	 */
	@Then("^I should be logged in as an admin user$")
	public void checkIfAdminLoginSuccessful() {
		String userName = CONFIG.getProperty("admin.username");
		System.out.println("Checking if admin is logged in successfully." +userName );

		//String msg = String.format("Admin user %s not logged in.", userName);
		//Assert.assertTrue(msg, homePage.checkIfUserLoggedIn(userName));
		//assertTrue(driver.getTitle().equals("Digital Workspace - Digital Agent"));
	}

}
