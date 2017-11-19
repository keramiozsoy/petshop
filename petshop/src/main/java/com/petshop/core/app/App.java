package com.petshop.core.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.derby.iapi.services.io.DerbyIOException;

/**
 * 
 * @author user
 * 
 */
public class App {
	static Connection c = null;
	static String dbPath = "jdbc:derby:src/main/resources/databases/apacheDerby/pethopDerbyDB;create=true";
	static String user = "";
	static String password = "";

	public static void main(String[] args) {

		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("EmbeddedDriver can not be found");
			e.printStackTrace();
		}

		try {
			 c = DriverManager.getConnection(dbPath, user, password);

			Statement table = c.createStatement();

			table.executeUpdate("" //
					+ " CREATE TABLE animal " //
					+ " (" //
					+ " id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1,INCREMENT BY 1) , " //
					+ " name VARCHAR(50), " //
					+ " surname VARCHAR(50)" + " ) "); //
		} catch (SQLException e) {
			if(e.getSQLState().equals("X0Y32")){
				System.out.println("Table already createed ");
			}else{
				e.printStackTrace();	
			}
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
