package com.BlueBird.PageObjects.UserManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BlueBird.Helper.WebElementHelper;
import com.BlueBird.PageObjects.BasePage;
import com.BlueBird.Helper.WaitHelper;

public class UserManager extends BasePage {
	private WaitHelper waithelper;
	
	public UserManager(WebDriver driver, WebElementHelper webElementHelper) {
		super(driver, webElementHelper);
		waithelper= new WaitHelper(driver);
		PageFactory.initElements(driver, this);
	}
	
	String currenturl=driver.getCurrentUrl();
	
	/** click on User Manager button */
	@FindBy(xpath = "//a[@href='/user-manager']")
	private WebElement UserManager;
	public void clickonUserManager() throws InterruptedException {	
			webElementHelper.click(UserManager);		
	}
	
	
	/** click on User Manager button */
	@FindBy(xpath = "//button[contains(text(),'Create Single User')]")
	private WebElement createsingleuser;
	public void clickonCreateSingleUser() {
		webElementHelper.click(createsingleuser);
	}
	
	/** the input email id */
	@FindBy(xpath = "//input[@id='emailField']")
	private WebElement AccountEmail;
	
	/**
	 * Enter Account Email.
	 *
	 * @param userName
	 *            the user name
	 */
	public void enterAccountEmail() {
		webElementHelper.TypeInto(AccountEmail, generateData.generateEmail(9));
	}
	/** the input first name */
	@FindBy(xpath = "//input[@id='firstNameField']")
	private WebElement Firstname;
	
	/**
	 * Enter First Name
	 */
	public void enterFirstName() {
		webElementHelper.TypeInto(Firstname, generateData.generateRandomString(5));
	}
	
	@FindBy(xpath = "//input[@id='lastNameField']")
	private WebElement Lastname;
	public void enterLastName() {
		webElementHelper.TypeInto(Lastname, generateData.generateRandomString(5));
	}
	
	@FindBy(xpath = "//input[@id='user-title-filter']")
	private WebElement Jobtitle;
	public void enterJobTitle1() {
		webElementHelper.TypeInto(Jobtitle, generateData.generateRandomString(5));
	}
	
	@FindBy(xpath = "//input[@id='user-title-filter1']")
	private WebElement Jobtitle2;
	public void enterJobTitle2() {
		webElementHelper.TypeInto(Jobtitle2, generateData.generateRandomString(5));
	}
	
	@FindBy(xpath = "//select[@id='branchSelector']")
	private WebElement Location;
	@FindBy(xpath = "//option[contains(text(),'  Niagara Financial Centre - Corporate Park')]")
	private WebElement LocationNiagra;
	
	@FindBy(xpath = "//option[contains(text(),'  Veriday Inc')]")
	private WebElement LocationDemoQA;
	
	public void enterLocation() throws InterruptedException {
		webElementHelper.click(Location);
		System.out.println(currenturl);
		if(currenturl.contains("demo.qa")) {
			webElementHelper.click(LocationDemoQA);
			webElementHelper.click(Location);
		}
		else if(currenturl.contains("clic.qa"))
		{
			Thread.sleep(2000);
			webElementHelper.click(LocationNiagra);
			webElementHelper.click(Location);
		}
		
	}
	
	@FindBy(xpath = "//input[@id='provincial-list']")
	private WebElement StatesofRegistration;
	
	@FindBy(xpath = "//input[@value='AB']")
	private WebElement AddPLicenseAB;
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	private WebElement AddP;
	
	public void enterPLincense() throws InterruptedException {
		System.out.println(currenturl);
		if(currenturl.contains("demo.qa")) {
			webElementHelper.TypeInto(StatesofRegistration, generateData.generateRandomNumber(5));
		}
		else if(currenturl.contains("clic.qa"))
		{
			Thread.sleep(2000);
			waithelper.WaitForElementVisible(StatesofRegistration);
		 	webElementHelper.click(StatesofRegistration);
			webElementHelper.click(AddPLicenseAB);
			webElementHelper.click(AddP);
		}
		
	}
	@FindBy(xpath = "//input[@class='bfh-phone da-phone-number-input phone-number']")
	private WebElement Phone;
	public void enterPhone() {
		waithelper.WaitForElementToBeClickable(Phone);
		webElementHelper.TypeInto(Phone, generateData.generateRandomNumber(10));
	}
	
	@FindBy(xpath = "//button[contains(text(),'Save & Activate')]")
	private WebElement Save;
	public void clickSave() {
		webElementHelper.click(Save);
	}


}
