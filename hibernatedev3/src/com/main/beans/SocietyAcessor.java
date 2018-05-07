package com.main.beans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.main.factory.FactoryMethod;

public class SocietyAcessor {

	public void getSocietyinfo() throws Exception {
		try {
			Connection con = FactoryMethod.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from society");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
						+ rs.getString(4) + "  " + rs.getString(5) + "  " + rs.getString(6) + "  " + rs.getString(7)
						+ "  " + rs.getString(8) + "  " + rs.getString(9) + "  " + rs.getString(10) + "  "
						+ rs.getString(11) + "  " + rs.getString(12));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
