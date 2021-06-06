package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class appDB {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {

			conn = DB.getConnection();

			st = conn.createStatement();

			String sql = "SELECT * FROM department";

			rs = st.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + " - " + rs.getString("name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
