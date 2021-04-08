package com.BlueBird.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.BlueBird.Helper.WebElementHelper;

/**
 * The Class CalendarPage.
 */
public class CalendarPage extends BasePage {

	/**
	 * Instantiates a new calendar page.
	 *
	 * @param driver
	 *            the driver
	 * @param webElementHelper
	 *            the web element helper
	 */
	public CalendarPage(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		PageFactory.initElements(driver, this);
	}

}
