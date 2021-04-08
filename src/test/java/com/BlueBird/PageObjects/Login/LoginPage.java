/* Purpose: Contains all step definitions associated with the steps in Login.feature file.
 Created By: Dhaval Jethava
 Created Date: 6th March 2018
 */
package com.BlueBird.PageObjects.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.BasePage;



/**
 * The Class LoginPage.
 */
public class LoginPage extends BasePage {

	/**
	 * Instantiates a new login page.
	 *
	 * @param driver
	 *            the driver
	 * @param webElementHelper
	 *            the web element helper
	 */
	public LoginPage(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Launch application.
	 */
	public void LaunchApplication() {
		LOG.info("Launching web application URL: " + CONFIG.getProperty("application.url"));
		driver.manage().deleteAllCookies();
		driver.get(CONFIG.getProperty("application.url"));
	}

	/**
	 * Open new window.
	 */
	public void openNewWindow() {
		driver2 = new ChromeDriver();
		this.driver = driver2;
		driver.manage().window().maximize();
	}

	/** The input user name. */
	@FindBy(xpath = "//input[@id='A5755:loginForm:email']")
	private WebElement inputUserName;

	/**
	 * Enter user name.
	 *
	 * @param userName
	 *            the user name
	 */
	public void enterUserName(String userName) {
		webElementHelper.TypeInto(inputUserName, userName);
	}

	/** The input password. */
	@FindBy(xpath = "//input[@id='A5755:loginForm:password']")
	private WebElement inputPassword;

	/**
	 * Enter password.
	 *
	 * @param password
	 *            the password
	 */
	public void enterPassword(String password) {
		webElementHelper.TypeInto(inputPassword, password);
	}

	/** The button login. */
	@FindBy(xpath = "//input[@id='A5755:loginForm:login']")
	private WebElement buttonLogin;

		public void clickOnLoginButton() {
		webElementHelper.click(buttonLogin);
		ThreadSleep(800);
	}

	public void enterWrongUserName(String userName) {
		webElementHelper.TypeInto(inputUserName, userName);
	}

	public void enterWrongPassword(String password) {
		webElementHelper.TypeInto(inputPassword, password);
	}
	
	@FindBy(xpath = "//button[text()=' Ok ']/parent::div")
	private WebElement buttonOk;
	
	public void clickOnOkButton() {
		webElementHelper.click(buttonOk);
		ThreadSleep(500);
	}

	public void DoLoginwithAdminUser(String userName,String password) {
		LOG.info("Launching web application URL: " + CONFIG.getProperty("application.url"));
		driver.manage().deleteAllCookies();
		driver.get(CONFIG.getProperty("application.url"));
		//driver.switchTo().alert().getText();
		//System.out.println(driver.switchTo().alert().getText());
		webElementHelper.TypeInto(inputUserName, userName);
		webElementHelper.TypeInto(inputPassword, password);
		webElementHelper.click(buttonLogin);
	}

}
