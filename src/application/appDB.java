package application;

import java.sql.Connection;

import db.DB;

public class appDB {

	public static void main(String[] args) {

		Connection conn = DB.getConnection();
		if (conn != null) {
			System.out.println("Conexão com o banco estabelecida!!!");
		} else {
			System.out.println("Erro ao conectar com o BD!!");
		}
		DB.closeConnection();

	}

}
