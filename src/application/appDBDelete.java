package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class appDBDelete {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = DB.getConnection();
			String sql = "DELETE FROM department " + "WHERE id = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, 2);

			if (pst.executeUpdate() > 0) {
				System.out.println("Record successfully deleted!");
			}
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}

	}

}
