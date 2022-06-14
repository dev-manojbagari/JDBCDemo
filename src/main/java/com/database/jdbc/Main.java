package com.database.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.database.db.tables.Tours;


public class Main {

	public static void main(String[] args) throws Exception {

//		ResultSet rs = null;
		try (
				Connection conn = DBUtil.getConnection(DBType.HSQLDB);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(
						"SELECT tourId, tourName, price FROM tours " +
						"LIMIT 5, 5");
				) {
//			stmt.setMaxRows(5); // this is not ideal use limit clause in sql instead , as this fetches all rows and shows first five
			Tours.displayData(rs);
		} catch (SQLException e) {
			System.err.println(e);
		} 
	}
}

