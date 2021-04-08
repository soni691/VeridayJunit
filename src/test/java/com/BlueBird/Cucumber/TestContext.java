/*
 * 
 */
package com.BlueBird.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.BlueBird.Factory.DriverFactory;
import com.BlueBird.Helper.WaitHelper;
import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObject.adminHQ.AdminHQ;
import com.BlueBird.PageObjects.CalendarPage;
import com.BlueBird.PageObjects.CommonPage;
import com.BlueBird.PageObjects.HomePage;
import com.BlueBird.PageObjects.DigitalWorkSpace.DigitalWorkSpace;
import com.BlueBird.PageObjects.Login.LoginPage;
import com.BlueBird.PageObjects.OrganizationGroups.OrganizationalGroups;

import com.BlueBird.PageObjects.UserManager.UserManager;
import com.BlueBird.Util.Constants;
import com.BlueBird.Util.DriverDetail;

/**
 * The Class TestContext.
 */
public class TestContext {

	/** The driver. */
	private WebDriver driver;

	/** The web element helper. */
	private WebElementHelper webElementHelper;

	/** The driver factory. */
	private DriverFactory driverFactory;

	/** The login page. */
	private LoginPage loginPage;

	/** The home page. */
	private HomePage homePage;

	/** The common page. */
	private CommonPage commonPage;
	
	private CalendarPage calendarPage; 
	
	private UserManager usermanagerPage;
	
	private OrganizationalGroups organizationalgroupsPage;
	
	private DigitalWorkSpace digitalworkspacePage;
	
	private WaitHelper WaitHelperPage;
	
	private AdminHQ adminHQPage;
	/**
	 * Instantiates a new test context.
	 */
	public TestContext() {

		WebDriver dr = DriverDetail.getUnoccupiedDriver();

		if (dr != null) {
			this.driver = dr;
		} else {
			driverFactory = new DriverFactory();
			this.driver = driverFactory.getDriver();
		}

		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		this.webElementHelper = new WebElementHelper(driver);
	}

	/**
	 * Tear down driver.
	 */
	public void tearDownDriver() {
		DriverDetail.PushUnoccupiedDriver(this.driver);
	}

	/**
	 * Gets the login page.
	 *
	 * @return the login page
	 */
	public LoginPage getLoginPage() {
		loginPage = new LoginPage(this.driver, this.webElementHelper);
		return loginPage;
	}

	/**
	 * Gets the home page.
	 *
	 * @return the home page
	 */
	public HomePage getHomePage() {
		homePage = new HomePage(this.driver, this.webElementHelper);
		return homePage;
	}
	/**
	 * Gets the home page.
	 *
	 * @return the home page
	 */
	public UserManager getUserManagerPage() {
		usermanagerPage = new UserManager(this.driver, this.webElementHelper);
		return usermanagerPage;
	}
	
	public OrganizationalGroups getOrganizationalGroupsPage() {
		organizationalgroupsPage = new OrganizationalGroups(this.driver, this.webElementHelper);
		return organizationalgroupsPage;
	}
	
	public DigitalWorkSpace getDigitalWorkspacePage() {
		digitalworkspacePage = new DigitalWorkSpace(this.driver, this.webElementHelper);
		return digitalworkspacePage;
	}
	
	public AdminHQ getadminHQPage() {
		adminHQPage = new AdminHQ(this.driver, this.webElementHelper);
		return adminHQPage;
	}
	/**
	 * Gets the common page.
	 *
	 * @return the common page
	 */
	public CommonPage getCommonPage() {
		commonPage = new CommonPage(this.driver, this.webElementHelper);
		return commonPage;
	}

	public CalendarPage getCalendarPage() {
		calendarPage =new CalendarPage(this.driver, this.webElementHelper);
		return calendarPage;
	}

}
