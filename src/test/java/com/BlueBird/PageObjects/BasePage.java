/*
 * Parent class for all pages
 * Created By: Dhaval Jethava 
 * Created Date: 5th March 2018
 */
package com.BlueBird.PageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.BlueBird.Helper.DateHelper;
import com.BlueBird.Helper.PropertyHelper;
import com.BlueBird.Helper.WaitHelper;
import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.Util.Constants;
import com.BlueBird.Util.DriverDetail;
import com.BlueBird.Util.GenerateData;

/**
 * The Class BasePage.
 */
public class BasePage {

	/** The driver. */
	protected WebDriver driver = null;

	/** The driver 2. */
	protected WebDriver driver2 = null;

	/** The config. */
	protected Properties CONFIG = null;

	/** The web element helper. */
	protected WebElementHelper webElementHelper = null;

	/** The generate data. */
	protected GenerateData generateData;

	/** The date helper. */
	protected DateHelper dateHelper;

	/** The driver detail. */
	protected static DriverDetail driverDetail;

	/** The Screenshot name. */
	public String ScreenshotName;

	/** The Constant LOG. */
	protected static final Logger LOG = Logger.getLogger(BasePage.class);
		

	/**
	 * Instantiates a new base page.
	 *
	 * @param driver
	 *            the driver
	 * @param webElementHelper
	 *            the web element helper
	 */
	public BasePage(WebDriver driver, WebElementHelper webElementHelper) {

		this.driver = driver;
		this.webElementHelper = webElementHelper;

		generateData = GenerateData.getInstance();
		dateHelper = DateHelper.getInstance();

		CONFIG = PropertyHelper.getConfig(Constants.CONFIG_PROPERTY);
	}

	/**
	 * Sets the driver detail object.
	 *
	 * @param drDetail
	 *            the new driver detail object
	 */
	public static void setDriverDetailObject(DriverDetail drDetail) {
		driverDetail = drDetail;
	}

	/**
	 * Sets the driver.
	 *
	 * @param driver
	 *            the new driver
	 */
	public void setDriver(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	/**
	 * Gets the driver instance.
	 *
	 * @return the driver instance
	 */
	public WebDriver getDriverInstance() {
		return driver;
	}

	/**
	 * Take screen shot.
	 *
	 * @return the byte[]
	 */
	public byte[] takeScreenShot() {

		Date d = new Date();
		String today = new SimpleDateFormat(Constants.SCREENSHOT_SDF).format(d);
		ScreenshotName = String.format("Image_%s%s", today, Constants.IMAGE_EXTENSION);

		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		return screenshot;
	}

	/**
	 * Thread sleep.
	 *
	 * @param milliSecond
	 *            the milli second
	 */
	public void ThreadSleep(int milliSecond) {
		try {
			Thread.sleep(milliSecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
