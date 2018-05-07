package com.hib.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SocietyAcessor {

	public void getSocietyinfo() throws ClassNotFoundException {
		try {
			Class.forName(("com.mysql.jdbc.Driver"));
			Connection con = DriverManager.getConnection("jdbc:mysql:///apna_complex", "root", "root");
			System.out.println(con);

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from society");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			// System.out.println(rs.getInt(1) + " " + rs.getString("firstname") + " "
			// +rs.getString("email"));

			// step5 close the connection object

			try {
				stmt.close();
			} catch (Exception e) {
				System.out.println("stmt.close();");
				e.printStackTrace();
			}

			try {
				rs.close();
			} catch (Exception e) {
				System.out.println("rs.close()");
				e.printStackTrace();
			}

			try {
				con.close();
			} catch (Exception e) {
				System.out.println("con.close()");
				e.printStackTrace();
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
