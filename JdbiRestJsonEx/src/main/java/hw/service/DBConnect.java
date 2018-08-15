package hw.service;

import org.skife.jdbi.v2.DBI;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
*/

public class DBConnect {
	private static DBI dbi = null;

	public static DBI getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Congrats - Seems your MySQL JDBC Driver Registered!");
		} catch (ClassNotFoundException e) {
			System.out.println("Sorry, couldn't found JDBC driver");
			e.printStackTrace();
			return null;
		}
 

		if (dbi== null)
			dbi = new DBI("jdbc:mysql://localhost:3306/test",
                "root", "admin");  
		return dbi;
	}
/***
	private static void makeJDBCConnection() {
 
		Connection conn;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Congrats - Seems your MySQL JDBC Driver Registered!");
		} catch (ClassNotFoundException e) {
			System.out.println("Sorry, couldn't found JDBC driver");
			e.printStackTrace();
			return;
		}
 
		try {
			// DriverManager: The basic service for managing a set of JDBC drivers.
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			if (conn != null) {
				System.out.println("Connection Successful! Enjoy. Now it's time to push data");
			} else {
				System.out.println("Failed to make connection!");
			}
		} catch (SQLException e) {
			System.out.println("MySQL Connection Failed!");
			e.printStackTrace();
			return;
		}
	}
	*/
}
