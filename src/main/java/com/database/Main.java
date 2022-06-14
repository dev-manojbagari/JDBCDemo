package com.database;

import java.sql.SQLException;

import com.database.tables.AdminManager;

public class Main {

	public static void main(String[] args) throws SQLException {

		AdminManager.displayAllRows();

	}
}
