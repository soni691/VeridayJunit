package com.BlueBird.StepDefinition;

import com.BlueBird.PageObjects.NewBrowserPage;
import cucumber.api.java.en.And;

/**
 * The Class NewBrowserStepDefinition.
 */
public class NewBrowserStepDefinition {

	/** The new browser page. */
	private NewBrowserPage newBrowserPage;

	/**
	 * Instantiates a new new browser step definition.
	 */
	public NewBrowserStepDefinition() {
		newBrowserPage = new NewBrowserPage();
	}

	/**
	 * Open new browser.
	 */
	@And("^I open a new browser window$")
	public void openNewBrowser() {
		newBrowserPage.launchHomePage();
	}

	/**
	 * Close new browser.
	 */
	@And("^I close new browser$")
	public void closeNewBrowser() {
		newBrowserPage.closeBrowser();
	}

	
}
