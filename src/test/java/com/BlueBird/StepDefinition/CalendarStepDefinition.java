package com.BlueBird.StepDefinition;


import com.BlueBird.Cucumber.TestContext;
import com.BlueBird.PageObjects.CalendarPage;

/**
 * The Class CalendarStepDefinition.
 */
public class CalendarStepDefinition {
	
	/** The calendar page. */
	private CalendarPage calendarPage;
	
	/**
	 * Instantiates a new calendar step definition.
	 *
	 * @param testContext the test context
	 */
	public CalendarStepDefinition(TestContext testContext) {
		calendarPage = testContext.getCalendarPage();
	}

	
	
}
