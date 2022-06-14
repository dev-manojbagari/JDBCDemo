package com.database.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import com.database.db.tables.Tours;


public class Main {

	private static final String USERNAME = "dbuser";
	private static final String PASSWORD = "dbpassword";
	private static final String CONN_STRING = "jdbc:hsqldb:data/explorecalifornia";

	public static void main(String[] args) throws SQLException {

		try (   Connection conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT coutn(*) FROM states");) {

			Tours.displayData(rs);

		} catch (SQLException e) {
			DBUtil.processException(e);
		}

	}
}
