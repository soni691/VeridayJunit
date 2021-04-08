package com.BlueBird.StepDefinition.OrganizationalGroups;

import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.PageObjects.OrganizationGroups.OrganizationalGroups;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrganizationalGroupsStepDefinition {
	private OrganizationalGroups ogroupspage;
	
	public OrganizationalGroupsStepDefinition(TestContext testContext) {
		ogroupspage = testContext.getOrganizationalGroupsPage();
	}
	
	@And("^I click on Organizational Groups option$")
	public void I_click_on_Organizational_Groups_option() throws Throwable {
		ogroupspage.clickonogroups();
	}
	
	@And("^I select Stored Group Name$")
	public void I_select_Stored_Group_Name() throws Throwable {
		ogroupspage.SelectStoredGroupName();
	}
	
	@And("^I select Stored Region Name$")
	public void I_select_Stored_Region_Name() throws Throwable {
		ogroupspage.SelectStoredRegionName();
	}
	
	@And("^I click on New button$")
	public void I_click_on_New_button() throws Throwable {
		ogroupspage.clickonNew();
	}
	
	@And("^I click on Group button$")
	public void I_click_on_Group_button() throws Throwable {
		ogroupspage.clickonNewGroup();
	}
	@And("^I enter Group name$")
	public void I_enter_Group_name() throws Throwable {
		ogroupspage.enterGroupName();
	}
	@And("^I click on SaveChanges button$")
	public void I_click_on_SaveChanges_button() throws Throwable {
		ogroupspage.clickonSaveChanges();
		
	}
	
	@Then("^a New Group is created$")
	public void a_New_Group_is_created() throws Throwable {
		ogroupspage.VerifyGroupSavedPopup();
		System.out.println("New Group Is created");		
	}
	
	@When("^I click on Region button$")
	public void i_click_on_Region_button() throws Throwable {
		ogroupspage.clickonNewRegion();
	  
	}

	@And("^I enter Region name$")
	public void i_enter_Region_name() throws Throwable {
		ogroupspage.enterRegionName();
	   
	}

	@And("^I enter Region Addressline1$")
	public void i_enter_Region_Addressline1() throws Throwable {
		ogroupspage.enterRegionAddress1();
	    
	}
	
	@And("^I enter Region Addressline2$")
	public void i_enter_Region_Addressline2() throws Throwable {
		ogroupspage.enterRegionAddress2();
	    
	}

	@And("^I enter Region City$")
	public void i_enter_Region_City() throws Throwable {
		ogroupspage.enterRegionCity();
	    
	}

	@And("^I enter Region State$")
	public void i_enter_Region_State() throws Throwable {
		ogroupspage.enterRegionState();
	    
	}

	@And("^I enter Region ZIP$")
	public void i_enter_Region_ZIP() throws Throwable {
		ogroupspage.enterRegionpcode();
	    
	}

	@And("^I enter Region Country$")
	public void i_enter_Region_Country() throws Throwable {
		ogroupspage.enterRegioncountry();
	   
	}

	@Then("^a New Region is created$")
	public void a_New_Region_is_created() throws Throwable {
		ogroupspage.VerifyRegionSavedPopup();
	   System.out.println("New Region is created");
	    
	}
	
	@And("^I select Stored Branch Name$")
	public void I_select_Stored_Branch_Name() throws Throwable {
		ogroupspage.SelectedBranchName();
	   System.out.println("Branch is Updated");
	    
	}
	
	@And("^I click on Branch button$")
	public void i_click_on_Branch_button() throws Throwable {
		ogroupspage.clickonNewBranch();
	   
	}

	@And("^I enter Branch name$")
	public void i_enter_Branch_name() throws Throwable {
		ogroupspage.enterBranchName();
	 
	}

	@And("^I enter Branch Addressline1$")
	public void i_enter_Branch_Addressline1() throws Throwable {
		ogroupspage.enterRegionAddress1();
	 
	}
	
	@And("^I enter Branch Addressline2$")
	public void i_enter_Branch_Addressline2() throws Throwable {
		ogroupspage.enterRegionAddress2();
	 
	}

	@And("^I enter Branch City$")
	public void i_enter_Branch_City() throws Throwable {
		ogroupspage.enterRegionCity();
	}

	@And("^I enter Branch State$")
	public void i_enter_Branch_State() throws Throwable {
		ogroupspage.enterRegionState();
	 
	}

	@And("^I enter Branch ZIP$")
	public void i_enter_Branch_ZIP() throws Throwable {
		ogroupspage.enterRegionpcode();
	   
	}

	@And("^I enter Branch Country$")
	public void i_enter_Branch_Country() throws Throwable {
		ogroupspage.enterRegioncountry();
	    
	}

	@Then("^a New Branch is created$")
	public void a_New_Branch_is_created() throws Throwable {
		ogroupspage.VerifyBrnchSavedPopup();
	    System.out.println("New Branch Is created");
	    
	}
	
	@And("^I click on Edit button$")
	public void i_click_on_Edit_button() throws Throwable {
	    ogroupspage.clickonEdit();
	    
	}

	@And("^I click on Attribute dropdown$")
	public void i_click_on_Attribute_dropdown() throws Throwable {
	    ogroupspage.clickonGroupAttribute();
	    
	}

	@Then("^a group is updated$")
	public void a_group_is_updated() throws Throwable {
	    ogroupspage.VerifyUpdatePopup();
	   
	}
	@Then("^a region is updated$")
	public void a_region_is_updated() throws Throwable {
	    ogroupspage.VerifyUpdateRegionPopup();
	   
	}
	
	@Then("^a branch is updated$")
	public void a_branch_is_updated() throws Throwable {
	    ogroupspage.VerifyBrnchSavedPopup();
	   
	}
}
