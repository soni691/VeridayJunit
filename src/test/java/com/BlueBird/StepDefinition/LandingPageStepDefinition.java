package com.BlueBird.StepDefinition;

import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.PageObjects.HomePage;

/**
 * The Class LandingPageStepDefinition.
 */
public class LandingPageStepDefinition {

	/** The home page. */
	private HomePage homePage;

	/**
	 * Instantiates a new landing page step definition.
	 *
	 * @param testContext
	 *            the test context
	 */
	public LandingPageStepDefinition(TestContext testContext) {
		homePage = testContext.getHomePage();
	}

	
}
