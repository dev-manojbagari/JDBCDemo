package com.database.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.database.tables.Tours;


public class Main {

	public static void main(String[] args) throws SQLException {

		try (
				Connection conn = DBUtil.getConnection(DBType.MYSQL);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM tours");
				) {
			
			Tours.displayData(rs);

		} catch (SQLException e) {
			DBUtil.processException(e);
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}


