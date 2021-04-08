/* Purpose: Contains methods which are common across multiple pages.
 Created By: Dhaval Jethava 
 Created Date: 5th March 2018
 */
package com.BlueBird.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WebElementHelper;


/**
 * The Class CommonPage.
 */

public class CommonPage extends BasePage {

	/** The skillshorttxt. */
	public static String skillshorttxt;

	/**
	 * Instantiates a new common page.
	 *
	 * @param driver
	 *            the driver
	 * @param webElementHelper
	 *            the web element helper
	 */
	public CommonPage(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=' Update ']")
	private WebElement buttonUpdate;
	
	public void clickOnUpdateButton() {
		webElementHelper.scrollToElement(buttonUpdate);
		webElementHelper.click(buttonUpdate);
		
	}

}
