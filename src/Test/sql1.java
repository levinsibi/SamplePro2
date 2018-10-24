package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class sql1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String dbusername;
		String dbpassword;
		String databaseURLQA = "jdbc:sqlserver://qatcxsql";// server
		String connectionUrl = "";
		Connection connection;
		String resultValue = "";
		ResultSet rs;

		// To connect with Database

		connectionUrl = databaseURLQA;
		dbusername = "webreportuser";// dbusername
		dbpassword = "webreportuser123";// dbpassword

		connection = DriverManager.getConnection(connectionUrl, dbusername, dbpassword);
		if (connection != null) {
			System.out.println("Connected to the database ..");

			@SuppressWarnings("null")
			Statement stmt = connection.createStatement();

			// rs=stmt.executeQuery("SELECT * FROM
			// [FY19_QA_Demo_HRTaxMasterDB].[dbo].[users] where Login ='TCXSel_zXvzqTc'");
				rs = stmt.executeQuery(
						"SELECT TOP 5 * FROM [FY19_QA_Demo_HRTaxMasterDB].[dbo].[users] where Login LIKE 'TCXSel%'");
			ResultSetMetaData rsmd = rs.getMetaData();

			int columnsNumber = rsmd.getColumnCount();
			for (int i = 1; i <= columnsNumber; i++) {
				String name = rsmd.getColumnName(i);
				System.out.print(name + "\t");
			}
			while (rs.next()) {
				// Print one row
				for (int i = 1; i <= columnsNumber; i++) {

					System.out.print(rs.getString(i) + " "); // Print one element of a row

				}

				System.out.println();// Move to the next line to print the next row.

			}

		}

	}

}
