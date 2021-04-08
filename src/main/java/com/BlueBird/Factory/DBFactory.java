/* Purpose: Contains Database connection
 Created By: Dhaval Jethava
 Created Date: 6th March 2018
 */
package com.BlueBird.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.BlueBird.Helper.PropertyHelper;
import com.BlueBird.Util.Constants;

/**
 * A factory for creating DB objects.
 */
public class DBFactory {

	/** The conn. */
	private static  Connection conn = null;
	
	/** The config. */
	private static Properties CONFIG = PropertyHelper.getConfig(Constants.CONFIG_PROPERTY);

	
	/**
	 * Instantiates a new DB factory.
	 */
	private DBFactory() {
		
	}
	
	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	public static synchronized Connection getConnection() {
		
		try {
			if (conn != null && !conn.isClosed()) {
				return conn;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		String JDBCDriver = "";
		String connectionURL = "";
		String userName = "'";
		String password = "";
		
		if (CONFIG.getProperty("db.type").equalsIgnoreCase("mySQL")) {
			JDBCDriver = CONFIG.getProperty("mysql.jdbc.driver");
			connectionURL = CONFIG.getProperty("mysql.connection.url");
			userName = CONFIG.getProperty("mysql.username");
			password = CONFIG.getProperty("mysql.password");
		}
		else if (CONFIG.getProperty("db.type").equalsIgnoreCase("ORACLE")) {
			JDBCDriver = CONFIG.getProperty("oracle.jdbc.driver");
			connectionURL = CONFIG.getProperty("oracle.connection.url");
			userName = CONFIG.getProperty("oracle.username");
			password = CONFIG.getProperty("oracle.password");
		}
		
		try {
			Class.forName(JDBCDriver);
			conn = DriverManager.getConnection(connectionURL, userName, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	/**
	 * Gets the connection.
	 *
	 * @param dbName the db name
	 * @return the connection
	 */
	public static synchronized Connection getConnection(String dbName) {
		
		try {
			if (conn != null && !conn.isClosed()) {
				return conn;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		String JDBCDriver = "";
		String connectionURL = "";
		String userName = "'";
		String password = "";
		
		if (CONFIG.getProperty("db.type").equalsIgnoreCase("ORACLE")) {
			JDBCDriver = CONFIG.getProperty("oracle.jdbc.driver");
			connectionURL = CONFIG.getProperty("oracle.connection.url");
			if (dbName.equalsIgnoreCase("WR")) {
				userName = CONFIG.getProperty("oracleWR.username");
				password = CONFIG.getProperty("oracleWR.password");
			}
			else if (dbName.equalsIgnoreCase("WR_TRF")) {
				userName = CONFIG.getProperty("oracleTRF.username");
				password = CONFIG.getProperty("oracleTRF.password");
			}
			else {
				userName = CONFIG.getProperty("oracle.username");
				password = CONFIG.getProperty("oracle.password");
			}
		}
		
		try {
			Class.forName(JDBCDriver);
			conn = DriverManager.getConnection(connectionURL, userName, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	/**
	 * Close connection.
	 */
	public static synchronized void closeConnection() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
			conn = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Execute callable statement.
	 *
	 * @param execText the exec text
	 * @param param the param
	 */
	public static synchronized void executeCallableStatement(String execText, String[] param) {
		
		try {
			getConnection();
			PreparedStatement statement = conn.prepareCall(execText);
			
			for (int i = 1 ; i <= param.length ; i++) {
				statement.setString(i, param[i-1]);
			}
			
			statement.executeUpdate();
			Thread.sleep(3000);
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
	}
	
	/**
	 * Execute callable statement.
	 *
	 * @param dbName the db name
	 * @param execText the exec text
	 * @param param the param
	 */
	public static synchronized void executeCallableStatement(String dbName, String execText, String[] param) {
		
		try {
			getConnection(dbName);
			PreparedStatement statement = conn.prepareCall(execText);
			
			for (int i = 1 ; i <= param.length ; i++) {
				statement.setString(i, param[i-1]);
			}
			
			statement.executeUpdate();
			Thread.sleep(3000);
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
	}
	
	public static synchronized void executeUpdate(String dbName, String query) {
		
		Statement statement = null;
		try {
			getConnection(dbName);
			conn.setAutoCommit(true);
			statement = conn.createStatement();
			statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			closeConnection();
		}
	}
	
	public static synchronized ResultSet executeQuery(String dbName, String query) {
		Statement statement = null;
		ResultSet rs = null;
		try {
			getConnection(dbName);
			statement = conn.createStatement();
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
}
