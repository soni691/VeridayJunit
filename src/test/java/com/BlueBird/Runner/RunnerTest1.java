/* Purpose: Contains Run method and generate report in this file
 Created By: Dhaval Jethava 
 Created Date: 5th March 2018
 */
package com.BlueBird.Runner;

import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BlueBird.Factory.DBFactory;
import com.BlueBird.Helper.PropertyHelper;
import com.BlueBird.StepDefinition.BaseSteps;
import com.BlueBird.Util.Constants;
import com.BlueBird.Util.CustomFormatter;
import com.BlueBird.Util.Variables;
import com.aventstack.extentreports.reporter.KlovReporter;
//import com.cucumber.listener.ExtentCucumberFormatter;
//import com.cucumber.listener.ExtentProperties;
//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * The Class RunnerTest.
 */

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {

//----------------------------------------Phase:-1-------------------------------------------------------------------------------

//				"classpath:featureFiles/AccountGroups/AccountGroups.feature",
//				"classpath:featureFiles/Administration/ConfirmLeavePage.feature",
//				"classpath:featureFiles/Administration/CopyEmployeeGroup.feature",
//				"classpath:featureFiles/Administration/DeletingUserFromWR.feature",
//				"classpath:featureFiles/Administration/PasswordRuleAdministration.feature",
//				"classpath:featureFiles/Administration/functionAuthorizationGeneralFlow.feature",
//				"classpath:featureFiles/AttributeGroups/ExchangableAttributeFilter.feature",
//				"classpath:featureFiles/Changeconfirmations/ChangeConfirmationsscreen.feature",
//				"classpath:featureFiles/FunctionGroups/Authorization.feature",
//				
//				"classpath:featureFiles/GroupFunctions/AuthenticationHistory.feature",
//				"classpath:featureFiles/GroupFunctions/ChangeConfirmationReport.feature",
//				"classpath:featureFiles/GroupFunctions/DayScheduleReport.feature",
//				"classpath:featureFiles/GroupFunctions/Messagesandnotificationreport.feature",
//				"classpath:featureFiles/GroupFunctions/Messagesgroupfunctions.feature",
//				"classpath:featureFiles/GroupFunctions/ShiftExchangeAndPreferenceByUser.feature",
//				"classpath:featureFiles/GroupFunctions/ShiftExchangesGroupFunctions.feature",
//				"classpath:featureFiles/GroupFunctions/ShiftPreferenceEntry.feature",
//				"classpath:featureFiles/Message/DeleteOptionEnhancements.feature",
//				"classpath:featureFiles/Rules/MinRestTimeRule.feature",
//				"classpath:featureFiles/Rules/Rules.feature",
//				
//				"classpath:featureFiles/ShiftExchange/AdHocFilterShiftExchange.feature",
//				"classpath:featureFiles/ShiftExchange/EgoSwapAcceptance.feature",
//				"classpath:featureFiles/ShiftExchange/EgoTradeAcceptance.feature",
//				"classpath:featureFiles/ShiftExchange/ExchangableShiftsFilter.feature",
//				"classpath:featureFiles/ShiftExchange/FunctionAuthorization.feature",
//				"classpath:featureFiles/ShiftExchange/ListViewSwapExchange.feature",
//				"classpath:featureFiles/ShiftExchange/MaxConsecutiveDaysShiftExchange.feature",
//				"classpath:featureFiles/ShiftExchange/MultiDaySwapAcceptance.feature",
//				"classpath:featureFiles/ShiftExchange/RosterSkillFilter.feature",
//				"classpath:featureFiles/ShiftExchange/SelectingBothshiftsForShiftTradeAndEgoTrade.feature",
//				"classpath:featureFiles/ShiftExchange/ShiftExchange.feature",
//				"classpath:featureFiles/ShiftExchange/ShiftExchangeMinOffHoursRule.feature",
//				"classpath:featureFiles/ShiftExchange/SwapAcceptance.feature",
//				"classpath:featureFiles/ShiftExchange/SwapMainFlowAccept.feature",
//				"classpath:featureFiles/ShiftExchange/TradeAcceptance.feature",
//				"classpath:featureFiles/ShiftExchange/TradeMainFlowAccept.feature",
//				"classpath:featureFiles/ShiftPreference/DisplayListBoxFilter.feature",
				
				"classpath:featureFiles/AbsenceDayRequest/AddLastModificationTimeStampToADR.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRAbsenceShifts.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRAccConfiguration.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRAccountBalanceDisplay.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRAllowAnsL1&AllowViewL2.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRAllowAnsL2&AllowViewL1.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRAllowViewL1&AllowViewL2.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRApprovalL1.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRApproveTruncatedRequest.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRApproveTruncatedSpecialTreatmentRequest.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRBlockLengthOverlap.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRCancelOpenPending.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRCheckMinDayAfterTruncation.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRCommentsEnvelope.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRConfigureSysParameter.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRConfirmationNeeded.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRCreateGroupParameter.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRDefinePeakPeriods.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRDiffAutoExtDiffPlanner.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRDiffAutoExtSamePlanner.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRDiffAutoExtWRPlanner.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRDiffCheckQualification.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRDiffDuration.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRDifferentBlockLength.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRInBlocksOfMonths.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRInBlocksOfWeeks.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRLastModification.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRLateNoticeApproval.feature",
				"classpath:featureFiles/AbsenceDayRequest/ADRMainFlowPlanner.feature",

		}, 
		tags = {"~@ignore"},
		glue = { "com.BlueBird.StepDefinition" },
		plugin = { "junit:target/cucumberJunit.xml" , "com.BlueBird.Util.CustomFormatter"}    //,"pretty"//, "json:target/Cucumber.json"} // "com.cucumber.listener.ExtentCucumberFormatter:", 
		)


public class RunnerTest1 {

	/** The config. */
	private static Properties CONFIG = PropertyHelper.getConfig(Constants.CONFIG_PROPERTY);

	/** The log. */
	private static Logger log = Logger.getLogger(RunnerTest1.class.getName());

	/** The stmt. */
	private static Statement stmt = null;

	/** The start time. */
	private static String startTime;

	/** The end time. */
	private static String endTime;

	/** The HTML report path. */
	private static String HTMLReportPath;

	/** The report path. */
	private static File reportPath;

	/** The klov. */
	private static KlovReporter klov = null;

	/**
	 * Setup - called before test suite.
	 */
	@BeforeClass
	public static void Setup() {

		Date d = new Date();
		String today = new SimpleDateFormat(Constants.SCREENSHOT_SDF).format(d);
		String reportName = String.format("Report_%s%s", today, Constants.HTML_EXTENSION);

		if (CustomFormatter.getReportInstance() == null) {

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
			
		}

		/************************ LOGGER ***********************/
		PropertyConfigurator.configure(Constants.PROPERTIES_URI + "log4j.properties");
		log.info("********* Starting Test Execution. ***********");

		startTime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(d);
		HTMLReportPath = reportName;

	}

	/**
	 * Closure - called after test suite.
	 */
	@AfterClass
	public static void Closure() {
		log.info("********* Ending Test Execution. ***********");
		endTime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(System.currentTimeMillis());
		
		/*********************** DATABASE **********************/
		// generateDBEntry();

	}

	/**
	 * Generate DB entry.
	 */
	public static void generateDBEntry() {
		try {
			stmt = DBFactory.getConnection().createStatement();

			String SQL = "Insert Into " + Constants.TESTRUN_TABLE
					+ " (`StartTime`, `EndTime`, `HTMLreportPath`) values ('" + startTime + "', '" + endTime + "', \""
					+ HTMLReportPath + "\")";

			stmt.executeUpdate(SQL, Statement.RETURN_GENERATED_KEYS);

			ResultSet rs = stmt.getGeneratedKeys();
			int runID = -1;

			if (rs.next()) {
				System.out.println("Auto Generated Key is : " + rs.getInt(1));
				runID = rs.getInt(1);
			}

			klov.setReportName(CONFIG.getProperty("project.name") + "_TestRun:" + runID);
			klov.setKlovUrl("http://" + CONFIG.getProperty("spring.data.mongodb.host"));

			for (Map<String, String> scenarioEntry : BaseSteps.getScenarioList()) {

				SQL = String.format(
						"Insert Into %s (`testRunID`, `scenarioName`, `startTime`, `endTime`, `status`, `screenshotPath`) "
								+ "	values ('%d', '%s', '%s', '%s', '%s', '%s')",
						Constants.SCENARIO_TABLE, runID, scenarioEntry.get("ScenarioName"),
						scenarioEntry.get("ScenarioStartTime"), scenarioEntry.get("ScenarioEndTime"),
						scenarioEntry.get("ScenarioStatus"), scenarioEntry.get("ScenarioScreenshot"));

				stmt.executeUpdate(SQL, Statement.RETURN_GENERATED_KEYS);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBFactory.closeConnection();
		}

	}

}
