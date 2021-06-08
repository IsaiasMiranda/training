package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class appDBUpdate {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = DB.getConnection();

			String sql = "UPDATE seller SET Name=? WHERE Id=?";

			pst = conn.prepareStatement(sql);

			pst.setString(1, "Nazare Silva");
			pst.setInt(2, 9);

			if (pst.executeUpdate() > 0) {
				System.out.println("Atualizado com sucesso!!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}
	}
}
