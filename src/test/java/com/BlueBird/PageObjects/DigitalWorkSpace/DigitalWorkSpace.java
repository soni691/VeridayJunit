package com.BlueBird.PageObjects.DigitalWorkSpace;


import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WaitHelper;
import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.BasePage;

public class DigitalWorkSpace extends BasePage {
private WaitHelper waithelper;
	
	public DigitalWorkSpace(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		waithelper= new WaitHelper(driver);
		PageFactory.initElements(driver, this);
	}
	
	/**Verify AdminHQ Page title */
	public void verifyadminhqPageTile() throws InterruptedException {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Admin HQ - Digital Agent";
		assertEquals(actualTitle,expectedTitle);
	}
	
	/** click on AdminHQ option */
	@FindBy(xpath = "//h3[contains(text(),'Admin HQ')]")
	private WebElement adminHQ;

	public void clickonAdminHQ() throws InterruptedException {
		waithelper.WaitForElementToBeClickable(adminHQ);
		webElementHelper.click(adminHQ);
	}
	
	/** click on Search for a hub button of AdminHQ page */
	@FindBy(xpath = "//button[normalize-space()='Search for a Hub']")
	private WebElement searchHub;

	public void clickonsearchHub() throws InterruptedException {
		waithelper.WaitForElementToBeClickable(searchHub);
		webElementHelper.click(searchHub);
	}
	
	/** click on Search button of Queues page */
	@FindBy(xpath = "//input[@placeholder='search']")
	private WebElement searchQueue;

	public void clickonsearchQueue() throws InterruptedException {
		waithelper.WaitForElementToBeClickable(searchQueue);
		webElementHelper.click(searchQueue);
	}
	
	/** click on New button of Organization Groups page */
	@FindBy(xpath = "//button[contains(text(),'+ New')]")
	private WebElement New;

	public void clickonNew() throws InterruptedException {
		waithelper.WaitForElementToBeClickable(New);
		webElementHelper.click(New);
	}
	
	/** click on Search user button of user manager page */
	@FindBy(xpath = "//button[normalize-space()='Search Users']")
	private WebElement searchuser;

	public void clickonsearchUser() throws InterruptedException {
		waithelper.WaitForElementToBeClickable(searchuser);
		webElementHelper.click(searchuser);
	}
	
	/**Verify userManager Page title */
	public void verifyUsermanagerPageTile() throws InterruptedException {	
		String actualTitle = driver.getTitle();
		String expectedTitle = "User Manager - Digital Agent";
		assertEquals(expectedTitle,actualTitle);
	}
	
	/**Verify Queues Page title */
	public void verifyQueuesPageTile() throws InterruptedException {	
		String actualTitle = driver.getTitle();
		String expectedTitle = "Queues - Digital Agent";
		assertEquals(expectedTitle,actualTitle);
	}
	
	/**Verify Organization Groups Page title */
	public void verifyOgroupsPageTile() throws InterruptedException {	
		String actualTitle = driver.getTitle();
		String expectedTitle = "Organizational Groups - Digital Agent";
		assertEquals(expectedTitle,actualTitle);
	}
	
	/** click on User Manager option */
	@FindBy(xpath = "//a[@href='/user-manager']")
	private WebElement usermanager;
	public void clickonusermanager() throws InterruptedException {	
			webElementHelper.click(usermanager);		
	}
	
	/** click on queues option */
	@FindBy(xpath = "//h3[contains(text(),'Queues')]")
	private WebElement queues;
	public void clickonqueues() throws InterruptedException {	
			webElementHelper.click(queues);		
	}
	
	/** click on Organizational Groups option */
	@FindBy(xpath = "//h3[contains(text(),'Organizational Groups')]")
	private WebElement ogroups;
	public void clickonogroups() throws InterruptedException {	
			Thread.sleep(3000);
			webElementHelper.click(ogroups);		
	}
	
	/** click on BAck to Digital WorkSpace option */
	@FindBy(xpath = "//a[normalize-space()='Back to Digital Workspace']")
	private WebElement dworkspace;
	public void clickonodworkspace() throws InterruptedException {	
			webElementHelper.click(dworkspace);		
	}
}
