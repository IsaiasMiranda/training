package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class appDBInsert {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = DB.getConnection();

			String sql = "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)";

			pst = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			
			pst.setString(1, "Nazaré Santos");
			pst.setString(2, "nazaresantos1962@hotmail.com");
			pst.setDate(3, new java.sql.Date(sdf.parse("14/11/1962").getTime()));
			pst.setDouble(4, 10000.20);
			pst.setInt(5, 2);

			int validate = pst.executeUpdate();

			if (validate > 0) {
				ResultSet rs = pst.getGeneratedKeys();
				
				while (rs.next()) {
					System.out.println("ID: "+ rs.getInt(1));
				}
				System.out.println("Registration successful!! ");
			}
				

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}

	}

}
