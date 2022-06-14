package com.database;

import java.sql.SQLException;

import com.database.beans.Admin;
import com.database.tables.AdminManager;
import com.database.util.InputHelper;

public class Main {

	public static void main(String[] args) throws Exception {

		AdminManager.displayAllRows();
		
		Admin bean = new Admin();
		bean.setUserName(InputHelper.getInput("User name: "));
		bean.setPassword(InputHelper.getInput("Password: "));
		
		boolean result = AdminManager.insert(bean);
		
		if (result) {
			System.out.println("New row with primary key " + bean.getAdminId() + " was inserted!");
		}
	}

}
