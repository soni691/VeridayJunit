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
 * The Class RunnerTest3.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {
		//----------------------------------------Phase:-1-------------------------------------------------------------------------------		
		
//		"classpath:featureFiles/Administration/SecretQuestionsFunctionality.feature",
//		"classpath:featureFiles/Administration/SecretQuestionsScreen.feature",
//		"classpath:featureFiles/ExchangeableGroup/InterExchangeableGroups.feature",	
//		"classpath:featureFiles/GroupFunctions/GroupFunctionResetPassword.feature",
//		"classpath:featureFiles/GroupFunctions/RosterHistoryReport.feature",
//		"classpath:featureFiles/GroupFunctions/ShiftExchangeRequestLost.feature",
//		"classpath:featureFiles/Message/RecalledMessage.feature",
//		"classpath:featureFiles/Message/RestoreMessages.feature",
//		"classpath:featureFiles/Message/RosterExchangeMessages.feature",
//		"classpath:featureFiles/Message/RosterExchangesAcceptedThroughMessages.feature",
//		"classpath:featureFiles/Parameters/Parameters.feature",
//	
//		"classpath:featureFiles/GroupFunctions/DisplayExchangeRequestReport.feature",
//		"classpath:featureFiles/Message/BlockingMessages.feature",
//		"classpath:featureFiles/PeriodsFullAdministration/PeriodsFullAdministration.feature",
//		"classpath:featureFiles/Report/PrintEmployeeSchedule.feature",
//		"classpath:featureFiles/Rules/MaxConsWorkingDaysRule.feature",
//		"classpath:featureFiles/Rules/MinMaxHoursPerPeriodRule.feature",
//		"classpath:featureFiles/ShiftExchange/PeriodLimitationShiftExchangesAttributeType.feature",
//		"classpath:featureFiles/ShiftExchange/RequestExpirationfilter.feature",
//		"classpath:featureFiles/ShiftExchange/StaffingLevelEnteringFilter.feature",
//		"classpath:featureFiles/ShiftExchange/StaffingLevelLeavingFilter.feature",
//		"classpath:featureFiles/ShiftExchange/MaxTimeDifference.feature",
//		"classpath:featureFiles/ShiftExchange/MinMaxHoursNewRulesShiftExchange.feature",
//		"classpath:featureFiles/ShiftExchange/MultidaySameNumber.feature",
//		"classpath:featureFiles/ShiftGroups/ShiftGroups.feature",
//		"classpath:featureFiles/ShiftPreference/ShiftPreferenceMainFlow.feature",
//		"classpath:featureFiles/ShiftPreference/ShiftPreferenceRuleBlock.feature",
//		
//		"classpath:featureFiles/ShiftPreference/ShiftPreferenceRuleConsecutive.feature",
//		"classpath:featureFiles/ShiftPreference/ShiftPreferenceRules.feature",
//		"classpath:featureFiles/SkillMatrix/SkillMatrix.feature",
//		"classpath:featureFiles/UserAdministration/DifferentRolesOnRelativeDates.feature",
//		"classpath:featureFiles/WageAccounts/DisplayOfWageAccounts.feature",
//		"classpath:featureFiles/YearOverviewReport/YearOverviewReport.feature",

		"classpath:featureFiles/AbsenceDayRequest/ADRVerifyUndoRestoreFunction.feature",
		"classpath:featureFiles/AbsenceDayRequest/ADRVisualizeQuotaForMultiDayPendingReq.feature",
		"classpath:featureFiles/AbsenceDayRequest/ADRVisualizeQuotaForPendingReq.feature",
		"classpath:featureFiles/AbsenceDayRequest/ADRVisualizeQuotaStateCurve.feature",
		"classpath:featureFiles/AbsenceDayRequest/ADRVisualizeQuotaStateForMultiDayRequest.feature",
		"classpath:featureFiles/AbsenceDayRequest/ADRYearOverviewDisplay.feature",
		"classpath:featureFiles/AbsenceDayRequest/AEntryAutoExtendedPublicHolidays.feature",
		"classpath:featureFiles/AbsenceDayRequest/AllowToViewADRLevel1.feature",
		"classpath:featureFiles/AbsenceDayRequest/AllowToViewADRLevel2.feature",
		"classpath:featureFiles/AbsenceDayRequest/ApproveADR.feature",
		"classpath:featureFiles/AbsenceDayRequest/ApprovePlannerADRReceiveMessage.feature",
		"classpath:featureFiles/AbsenceDayRequest/AssignADRAttributeGroups.feature",
		"classpath:featureFiles/AbsenceDayRequest/CreateADROtherAgent.feature",
		"classpath:featureFiles/AbsenceDayRequest/CreatePlannerADRReceiveMessage.feature",
		"classpath:featureFiles/AbsenceDayRequest/DefineADRAttributeGroups.feature",
		"classpath:featureFiles/AbsenceDayRequest/DefineADRGroupLevelParameters.feature",
		"classpath:featureFiles/AbsenceDayRequest/DenyADR.feature",
		"classpath:featureFiles/AbsenceDayRequest/DisplayADRManageAgent.feature",
		"classpath:featureFiles/AbsenceDayRequest/EditOpenADR.feature",
		"classpath:featureFiles/AbsenceDayRequest/EmployeeADRinHalfMonth.feature",
		"classpath:featureFiles/AbsenceDayRequest/EmployeeReceiveMessagePlannerCancelOpenADR.feature",
		"classpath:featureFiles/AbsenceDayRequest/EmployeeReceiveMessagePlannerPendingADR.feature",
		"classpath:featureFiles/AbsenceDayRequest/EmployeeReceiveMessagePlannerUndoADR.feature",
		"classpath:featureFiles/AbsenceDayRequest/FilterSortAbsence.feature",
		"classpath:featureFiles/AbsenceDayRequest/OverlapsWhileCreateADR.feature",
		"classpath:featureFiles/AbsenceDayRequest/PendingPlannerADRReceiveMessage.feature",
		"classpath:featureFiles/AbsenceDayRequest/PlannerCanSeeADRMessage.feature",
		"classpath:featureFiles/AbsenceDayRequest/PlannerUndoADREmployeeReceiveMessage.feature",
		"classpath:featureFiles/AbsenceDayRequest/TruncatePlannerADRReceiveMessage.feature",
		"classpath:featureFiles/AbsenceDayRequest/VisualiseRosterInfo.feature",
},
		 tags = {"~@ignore"},
		glue = { "com.BlueBird.StepDefinition" }, plugin = { "junit:target/cucumberJunit.xml",
				"com.BlueBird.Util.CustomFormatter" })

public class RunnerTest3 {

	/** The report path. */
	private static File reportPath;

	/** The log. */
	private static Logger log = Logger.getLogger(RunnerTest3.class.getName());

	/**
	 * Setup - called before test-suite.
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
