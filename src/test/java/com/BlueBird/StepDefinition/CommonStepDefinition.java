/* Purpose: Contains all common method in this file.
 Created By: Dhaval Jethava 
 Created Date: 5th March 2018
 */
package com.BlueBird.StepDefinition;

import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.PageObjects.CommonPage;
import com.BlueBird.PageObjects.HomePage;

import cucumber.api.java.en.And;

/**
 * The Class CommonStepDefinition.
 */

public class CommonStepDefinition {

	/** The common page. */
	private CommonPage commonPage;

	/** The home page. */
	private HomePage homePage;

	/**
	 * Instantiates a new common step definition.
	 *
	 * @param testContext
	 *            the test context
	 */
	public CommonStepDefinition(TestContext testContext) {
		commonPage = testContext.getCommonPage();
		homePage = testContext.getHomePage();
	}
	
	@And("^I click on \"([^\"]*)\" in profile page$")
	public void clickOnProfilePage(String text) {
		homePage.clickOnProfilePage(text);
	}
	
	@And("^I click on update button$")
	public void clickOnUpdateButton() {
		commonPage.clickOnUpdateButton();
	}
	
	@And("^I click on \"([^\"]*)\" in home page$")
	public void clickOnHomePage(String text) {
		homePage.clickOnHomePage(text);
	}
}
