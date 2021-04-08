/* Purpose: Contains Login and other functionalities of Home Page of the application 
 Created By: Dhaval Jethava
 Created Date: 5th March 2018
 */
package com.BlueBird.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WebElementHelper;

/**
 * The Class HomePage.
 */
public class HomePage extends BasePage {

	/**
	 * Instantiates a new home page.
	 *
	 * @param driver
	 *            the driver
	 * @param webElementHelper
	 *            the web element helper
	 */

	public HomePage(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		PageFactory.initElements(driver, this);
	}

	/** The label user. */
	@FindBy(xpath = "//span[@class='username']/span")
	private WebElement labelUser;

	/**
	 * Check if user logged in.
	 *
	 * @param userName
	 *            the user name
	 * @return true, if successful
	 */
	public boolean checkIfUserLoggedIn(String userName) {

		try {
			String xPath = String.format("//span[@class='username']/span[text()='%s']", userName);
			webElementHelper.waitForTextToBePresentInElement(webElementHelper.getElement(By.xpath(xPath)), userName);
			String text = webElementHelper.getElementText(labelUser);
			if (text.contains(userName)) {
				return true;
			}

		} catch (Exception e) {
			return false;
		}

		return false;
	}

	public void clickOnProfilePage(String text) {
		String xPath = String.format("//a[text()='%s']", text);
		webElementHelper.click(webElementHelper.getElement(By.xpath(xPath)));
	}

	public void clickOnHomePage(String text) {
		String xPath = String.format("//span[text()='%s']/parent::a", text);
		ThreadSleep(800);
		webElementHelper.click(webElementHelper.getElement(By.xpath(xPath)));
		ThreadSleep(800);
	}
	
}