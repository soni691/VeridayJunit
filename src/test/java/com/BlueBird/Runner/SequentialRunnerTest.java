/* Purpose: Contains Run method and generate report in this file
 Created By: Dhaval Jethava 
 Created Date: 13th July 2018
 */

package com.BlueBird.Runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import com.BlueBird.Helper.PropertyHelper;
import com.BlueBird.Util.Constants;
import com.BlueBird.Util.CustomFormatter;
import com.BlueBird.Util.Variables;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(

		features = {
				//"classpath:featureFiles/Login/Login.feature",
				//"classpath:featureFiles/UserManager/UserManager.feature",
				//"classpath:featureFiles/OrganizationalGroups/OrganizationalGroups.feature"
				//"classpath:featureFiles/HomePage/HomePage.feature",
				"classpath:featureFiles/DigitalWorkSpace/DigitalWorkSpace.feature"
		},
		tags = { "~@ignore"},
		glue = { "com.BlueBird.StepDefinition" },
		plugin = { "junit:target/cucumberJunit.xml" , "com.BlueBird.Util.CustomFormatter"},
		dryRun = false
		)

public class SequentialRunnerTest {
	
	/** The log. */
	private static Logger log = Logger.getLogger(SequentialRunnerTest.class.getName());
	
	private static Properties CONFIG = PropertyHelper.getConfig(Constants.CONFIG_PROPERTY);
	
	/** The report path. */
	private static File reportPath;

	/**
	 * Setup - called before the test-suite.
	 */
	@BeforeClass
	public static void Setup() {

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
			CustomFormatter.addSystemInfo("browser", CONFIG.getProperty("browser"));

		} else {
			CustomFormatter.initiateCustomFormatter();
		}

		/************************ LOGGER ***********************/
		PropertyConfigurator.configure(Constants.PROPERTIES_URI + "log4j.properties");
		log.info("********* Starting Test Execution. ***********");

	}
	
}
