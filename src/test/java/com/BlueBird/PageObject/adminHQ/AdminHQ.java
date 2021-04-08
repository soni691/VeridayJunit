package com.BlueBird.PageObject.adminHQ;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WaitHelper;
import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.BasePage;

public class AdminHQ extends BasePage {
	private WaitHelper waithelper;

	public AdminHQ(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		waithelper = new WaitHelper(driver);
		PageFactory.initElements(driver, this);
	}

	/** click on AdminHQ option */
	@FindBy(xpath = "//h3[contains(text(),'Admin HQ')]")
	private WebElement adminHQ;

	public void clickonAdminHQ() throws InterruptedException {
		waithelper.WaitForElementToBeClickable(adminHQ);
		webElementHelper.click(adminHQ);
	}

	public void verifyAHQTitle() throws InterruptedException {
		String hqtile = driver.getTitle();
		String expectedTitle = "Admin HQ - Digital Agent";
		assertEquals(expectedTitle, hqtile);
	}

	/** click on HUbManager option */
	@FindBy(xpath = "//a[contains(text(),'Hub Manager')]")
	private WebElement hubManager;

	public void clickonHubManager() throws InterruptedException {
		waithelper.WaitForElementToBeClickable(hubManager);
		webElementHelper.click(hubManager);
	}

	/** click on Search Hub option */
	@FindBy(xpath = "//button[contains(text(),'Search for a Hub')]")
	private WebElement searchHub;

	public void validateHubManager() throws InterruptedException {
		waithelper.WaitForElementVisible(searchHub);
	}

	/** click on Global Settings option */
	@FindBy(xpath = "//a[contains(text(),'Global Settings')]")
	private WebElement gsetting;

	public void clickongSetting() throws InterruptedException {
		waithelper.WaitForElementToBeClickable(gsetting);
		webElementHelper.click(gsetting);
	}

	/** click on Profile Configuration option */
	@FindBy(xpath = "//a[@id='profile-settings-tab-label']")
	private WebElement pconfiguration;

	public void validateGlobalSetting() throws InterruptedException {
		waithelper.WaitForElementVisible(pconfiguration);
	}

	/** click on Email Template option */
	@FindBy(xpath = "//a[contains(text(),'Email Templates')]")
	private WebElement eTemplate;

	public void clickonETemplate() throws InterruptedException {
		waithelper.WaitForElementToBeClickable(eTemplate);
		webElementHelper.click(eTemplate);
	}

	/** verify add template textbox */
	@FindBy(xpath = "//button[normalize-space()='Add Template']")
	private WebElement addtemplate;

	public void validateEmailTemplate() throws InterruptedException {
		waithelper.WaitForElementVisible(addtemplate);
	}

	/** click on Maintenance option */
	@FindBy(xpath = "//a[contains(text(),'Maintenance')]")
	private WebElement maintenace;

	public void clickonMaintenance() throws InterruptedException {
		webElementHelper.click(maintenace);
	}

	/** verify add template textbox */
	@FindBy(xpath = "//button[contains(text(),'Reindex Content Data')]")
	private WebElement reindexcontentdata;

	public void validateMaintenance() throws InterruptedException {
		waithelper.WaitForElementVisible(reindexcontentdata);
	}

}
