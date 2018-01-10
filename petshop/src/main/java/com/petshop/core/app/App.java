package com.petshop.core.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.petshop.core.enums.Enums;
import com.petshop.core.util.FlywayUtil;
import com.petshop.core.util.JDBCUtil;

/**
 * 
 * @author user
 * 
 */
public class App {
	static Connection c = null;

	public static void main(String[] args) {

		try {
			c = JDBCUtil.OpenJdbcConnection(
					Enums.DatabaseDriver.APACHE_DERBY.toValue(), //
					Enums.DatabaseInfo.DB_PATH_APACHE_DERBY.toValue().toString(), //
					Enums.DatabaseInfo.USER.toValue().toString(), //
					Enums.DatabaseInfo.PASSWORD.toValue().toString());
			FlywayUtil.initialize();
		} catch (SQLException e1) {
			System.out.println("Driver problem");
			e1.printStackTrace();
		}



		try {
			Statement insert = c.createStatement();
			insert.executeUpdate(" INSERT INTO animal (name,surname) VALUES ('testName','testSurname') ");
		} catch (Exception e) {
			System.out.println("Can not be insert values" + e);
			e.printStackTrace();
		}

		try {
			Statement show = c.createStatement();
			ResultSet rs = show.executeQuery(" SELECT * FROM animal ");
			while (rs.next()) {
				System.out.println(" -------------- " //
						+ rs.getString("name") //
						+ " ------ " //
						+ rs.getString("surname"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
