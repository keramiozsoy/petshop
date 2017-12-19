package com.petshop.core.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author user
 * 
 */
public class JDBCUtil {

	public static Connection OpenJdbcConnection(final Object driver, final String dbPath, final String user,
			final String password) throws SQLException {

		try {
			DriverManager.registerDriver((Driver) Class.forName(driver.toString()).newInstance());
			// DriverManager.deregisterDriver(driver);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.out.println("Driver can not be found");
			e.printStackTrace();
			throw new SQLException(e);
		}

		Connection conn = DriverManager.getConnection(dbPath, user, password);

		return conn;
	}
}
