/* Purpose: Contains Custom formatter
 Created By: Dhaval Jethava
 Created Date: 6th March 2018
 */
package com.BlueBird.Util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import gherkin.formatter.Formatter;
import gherkin.formatter.Reporter;
import gherkin.formatter.model.Background;
import gherkin.formatter.model.Examples;
import gherkin.formatter.model.Feature;
import gherkin.formatter.model.Match;
import gherkin.formatter.model.Result;
import gherkin.formatter.model.Scenario;
import gherkin.formatter.model.ScenarioOutline;
import gherkin.formatter.model.Step;
import gherkin.formatter.model.Tag;

/**
 * The Class CustomFormatter.
 */
public class CustomFormatter implements Reporter, Formatter {

	/** The extent. */
	private static ExtentReports extent;

	/** The output path. */
	private static String outputPath;

	/** The feature count. */
	private static int featureCount;

	/** The feature test. */
	private ExtentTest featureTest;

	/** The scenario test. */
	private ExtentTest scenarioTest;

	/** The test steps. */
	private LinkedList<Step> testSteps = new LinkedList<Step>();

	/** The system info. */
	private static Map<String, String> systemInfo;

	/** The Constant MIME_TYPES_EXTENSIONS. */
	@SuppressWarnings("serial")
	private static final Map<String, String> MIME_TYPES_EXTENSIONS = new HashMap<String, String>() {
		{
			this.put("image/bmp", "bmp");
			this.put("image/gif", "gif");
			this.put("image/jpeg", "jpg");
			this.put("image/jpg", "jpg");
			this.put("image/png", "png");
			this.put("image/svg+xml", "svg");
			this.put("video/ogg", "ogg");
		}
	};

	/**
	 * Initiate custom formatter.
	 *
	 * @return the report instance
	 */
	public static ExtentReports getReportInstance() {
		return extent;
	}

	/**
	 * Initiate custom formatter.
	 *
	 * @param filePath
	 *            the file path
	 * @param opPath
	 *            the op path
	 */
	public static void initiateCustomFormatter(File filePath, File opPath) {
		if (extent == null) {
			featureCount = 0;
			extent = new ExtentReports(filePath.getAbsolutePath(), true, DisplayOrder.OLDEST_FIRST);
			outputPath = opPath.getAbsolutePath();
		}
	}

	/**
	 * Initiate custom formatter.
	 */
	public static void initiateCustomFormatter() {

	}

	/**
	 * Load config.
	 *
	 * @param configFile
	 *            the config file
	 */
	public static void loadConfig(File configFile) {
		extent.loadConfig(configFile);
	}

	public void result(Result result) {
		Step step = testSteps.poll();

		if ("passed".equals(result.getStatus())) {
			scenarioTest.log(LogStatus.PASS, step.getKeyword() + step.getName(), "PASSED");
		} else if ("failed".equals(result.getStatus())) {
			scenarioTest.log(LogStatus.FAIL, step.getKeyword() + step.getName(), result.getError());
		} else if ("skipped".equals(result.getStatus())) {
			scenarioTest.log(LogStatus.SKIP, step.getKeyword() + step.getName(), "SKIPPED");
		} else if ("undefined".equals(result.getStatus())) {
			scenarioTest.log(LogStatus.UNKNOWN, step.getKeyword() + step.getName(), "UNDEFINED");
		}
	}

	/**
	 * Adds the system info.
	 *
	 * @param param
	 *            the param
	 * @param value
	 *            the value
	 */
	public static void addSystemInfo(String param, String value) {
		if (systemInfo == null) {
			systemInfo = new HashMap<String, String>();
		}
		systemInfo.put(param, value);
	}

	@Override
	public void syntaxError(String state, String event, List<String> legalEvents, String uri, Integer line) {

	}

	@Override
	public void uri(String uri) {

	}

	@Override
	public void feature(Feature feature) {
		featureTest = extent.startTest("Feature: " + feature.getName());

		for (Tag tag : feature.getTags()) {
			featureTest.assignCategory(tag.getName());
		}
		featureCount++;
	}

	@Override
	public void scenarioOutline(ScenarioOutline scenarioOutline) {

	}

	@Override
	public void examples(Examples examples) {

	}

	@Override
	public void startOfScenarioLifeCycle(Scenario scenario) {
		scenarioTest = extent.startTest("Scenario: " + scenario.getName());

		for (Tag tag : scenario.getTags()) {
			scenarioTest.assignCategory(tag.getName());
		}
	}

	@Override
	public void background(Background background) {

	}

	@Override
	public void scenario(Scenario scenario) {

	}

	@Override
	public void step(Step step) {
		testSteps.add(step);
	}

	@Override
	public void endOfScenarioLifeCycle(Scenario scenario) {
		extent.endTest(scenarioTest);
		featureTest.appendChild(scenarioTest);
	}

	@Override
	public void done() {

	}

	@Override
	public void close() {
		if (extent != null && featureCount == 0) {
			extent.addSystemInfo(systemInfo);
			extent.close();
			DriverDetail.end();
			Utility.zipDirectory(Variables.reportFolderName, Variables.reportFolderName + ".zip");
		}
	}

	@Override
	public void eof() {
		extent.endTest(featureTest);
		extent.flush();
		featureCount--;
	}

	@Override
	public void before(Match match, Result result) {

	}

	@Override
	public void after(Match match, Result result) {

	}

	@Override
	public void match(Match match) {

	}

	@Override
	public void embedding(String s, byte[] data) {

		SimpleDateFormat sdf = new SimpleDateFormat(Constants.SCREENSHOT_SDF);
		String extension = (String) MIME_TYPES_EXTENSIONS.get(s);
		String fileName = "Image-" + sdf.format(System.currentTimeMillis()) + "." + extension;

		try {
			File outputPth = new File(outputPath + "/ScreenShots");
			if (!outputPth.exists()) {
				outputPth.mkdir();
			}
			FileUtils.writeByteArrayToFile(new File(outputPth + "/" + fileName), data);
			scenarioTest.log(LogStatus.INFO, scenarioTest.addScreenCapture(outputPth + "/" + fileName));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void write(String text) {
		scenarioTest.log(LogStatus.INFO, text);
	}

}
