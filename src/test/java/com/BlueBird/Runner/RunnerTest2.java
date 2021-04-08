package com.BlueBird.Runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BlueBird.Util.Constants;
import com.BlueBird.Util.CustomFormatter;
import com.BlueBird.Util.Variables;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * The Class RunnerTest2.
 */
@RunWith(Cucumber.class)
@CucumberOptions(

		features = {
//----------------------------------------Phase:-1-------------------------------------------------------------------------------
				
//				"classpath:featureFiles/Administration/DisplayAttributeGroupAssignmentsmainflow.feature",
//				"classpath:featureFiles/Administration/PasswordRulesFunctionality.feature",
//				"classpath:featureFiles/Administration/PreviewCalendarsConfigureTheTimeFormat.feature",
//				"classpath:featureFiles/Administration/ResetUserPassword.feature",
//				"classpath:featureFiles/Administration/ResourceTranslationsScreen.feature",
//				"classpath:featureFiles/AttributeGroups/AttributeGroups.feature",
//				"classpath:featureFiles/Calendar/RosterEntityUpdates.feature",
//				"classpath:featureFiles/EmployeeGroups/EmployeeGroups.feature",
//				"classpath:featureFiles/EmployeeGroups/ManagedEmployeeFilters.feature",
//				"classpath:featureFiles/GroupFunctions/DisplayAtrributesGroupMonthView.feature",
//				"classpath:featureFiles/GroupFunctions/DisplayRosterAttributesListView.feature",
//				"classpath:featureFiles/GroupFunctions/DisplayRosterAttributesMonthView.feature",
//				"classpath:featureFiles/GroupFunctions/DisplayRosterAttributesWeekView.feature",
//				"classpath:featureFiles/GroupFunctions/EmployeeSchedule.feature",
//				"classpath:featureFiles/GroupFunctions/EmployeeScheduleDAGListView.feature",
//				
//				"classpath:featureFiles/GroupFunctions/EmployeeScheduleDAGWeekView.feature",
//				"classpath:featureFiles/Message/FiltresForMessagesDashboard_WR-6.12.4.feature",
//				"classpath:featureFiles/Message/MessagesConfirmationNeeded.feature",
//				"classpath:featureFiles/Message/MessagesValidity.feature",
//				"classpath:featureFiles/Message/MessagesWithReply.feature",
//				"classpath:featureFiles/Rules/MultidayDaviationShiftExchange.feature",
//				"classpath:featureFiles/ShiftExchange/AcceptRequestFromAnotherUser.feature",
//				"classpath:featureFiles/ShiftExchange/EmployeeRoasterSameLayerFilter.feature",
//				"classpath:featureFiles/ShiftExchange/InterExchangeableGroupsShiftExchange.feature",
//				"classpath:featureFiles/ShiftExchange/IntradeShiftExchange.feature",
//				"classpath:featureFiles/ShiftExchange/MultidaySwapMainFlow.feature",
//				"classpath:featureFiles/ShiftExchange/RoasterSameLayerFilter.feature",
//				"classpath:featureFiles/ShiftExchange/RosterExchangeAllowLayer.feature",
//				
//				"classpath:featureFiles/ShiftExchange/RosterExchangeSameRosterFilter.feature",
//				"classpath:featureFiles/ShiftExchange/RosterExchangeStructure.feature",
//				"classpath:featureFiles/ShiftExchange/ShiftExchangeRules.feature",
//				"classpath:featureFiles/ShiftExchange/SwapMainFlowDenyCancel.feature",
//				"classpath:featureFiles/ShiftPreference/ShiftPreferenceDisplayFilters.feature",
//				"classpath:featureFiles/ShiftPreference/ShiftPreferenceDisplayShiftFilter.feature",
//				"classpath:featureFiles/ShiftPreference/ShiftpreferenceInputConsiderLayer.feature",
//				"classpath:featureFiles/UserAdministration/UserAdministration.feature",			
				
				"classpath:featureFiles/AbsenceDayRequest/ADRMainFlows.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRManagedFilterForCoEmployee.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRManagedFilterForCoUser.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRMFAtGroupLevel.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRMFAtUserLevelAndGroupLevel.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRMinMaxDurationDiffPlanner.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRMinMaxDurationSamePlanner.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRMinMaxDurationWRPlanner.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRMultilevelApproval.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRNoManagedEmpFilter.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADROpenAndApprovedRequestChange.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADROverlapsSomeAbsentShifts.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADROverlapsWhileSelectPending.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRPublicHoliday.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRQualificationExpiry.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRRestrictLeaveFinancialYear.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRSecondPlannerCancelRequest.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRSetStatusPending.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRSkillValidation.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRTruncateAgentAllow.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRUndoWithPlanner.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRValidationAbsenceGroup.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRValidationAutoExtended.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRValidationDayOFF.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRVerifyAbsenceDayDeadlineTime.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRVerifyAbsenceMessages.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRVerifyAllowToViewL1Funtion.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRVerifyAllowToViewL2Funtion.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRVerifyRestoreFunction.feature",
				
				
			
		},
		 tags = {"~@ignore"},
		glue = { "com.BlueBird.StepDefinition" }, plugin = { "junit:target/cucumberJunit.xml",
				"com.BlueBird.Util.CustomFormatter" })

public class RunnerTest2 {

	/** The report path. */
	private static File reportPath;

	/** The log. */
	private static Logger log = Logger.getLogger(RunnerTest2.class.getName());

	/**
	 * Setup - called before the test-suite.
	 */
	@BeforeClass
	public static void Setup() {

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (CustomFormatter.getReportInstance() == null) {

			Date d = new Date();
			String today = new SimpleDateFormat(Constants.SCREENSHOT_SDF).format(d);
			String reportName = String.format("Report_%s%s", today, Constants.HTML_EXTENSION);

			File dir = new File(today);
			dir = new File(Constants.REPORT_PATH + dir);
			if (!dir.exists()) {
				dir.mkdir();
				Variables.reportFolderName = dir;
			}
			reportPath = new File(dir + "/" + reportName);
			File folderPath = new File(dir + "/");

			CustomFormatter.initiateCustomFormatter(reportPath, folderPath);

			File extentConfig = new File(Constants.CONFIG_FILES_URI + Constants.EXTENT_FILE);
			CustomFormatter.loadConfig(extentConfig);
			CustomFormatter.addSystemInfo("user", System.getProperty("user.name"));
			CustomFormatter.addSystemInfo("os", System.getProperty("os.name"));

		} else {
			CustomFormatter.initiateCustomFormatter();
		}

		/************************ LOGGER ***********************/
		PropertyConfigurator.configure(Constants.PROPERTIES_URI + "log4j.properties");
		log.info("********* Starting Test Execution. ***********");

	}

}
