/* Purpose: Contains Dynamic variables
 Created By: Dhruval Barmeda
 Created Date: 11th March 2018
 */
package com.BlueBird.Util;

import java.io.File;
import java.util.HashMap;

/**
 * The Class Variables.
 */
public class Variables {

	public static String loggedInUserID;
	

	public static File reportFolderName;

	/** The shift start time. */
	public static String shiftStartTime;

	/** The shift end time. */
	public static String shiftEndTime;
	
	public static HashMap<String, String> paramData = new HashMap<String, String>();
	
	public static HashMap<String, Integer> nextShiftDay = new HashMap<String, Integer>();

	public static HashMap<String, String> nextShiftMonth = new HashMap<String, String>();

	public static HashMap<String, String> appPropertyValue = new HashMap<String, String>();

	public static ThreadLocal<String> myThreadLocal = new ThreadLocal<String>();

	public static String EMAILADDRESS;


	public static String groupName;
	
	public static String regionName;
	
	public static String branchName;
	
}
