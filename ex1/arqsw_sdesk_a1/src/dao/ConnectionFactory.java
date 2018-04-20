package dao;

import java.io.IOException;

/**
 * 
 * @author Accel Gustavo Araújo Rocha - RA:81616654 - SIN3AN-MCA
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
		Class.forName("com.mysql.jdbc.Driver");		
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		
	}
	}
	
	public static Connection getConnection() throws IOException {
		Connection conn = null;
		
		try {
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/servicedesk?user=alunos&password=alunos&useSSL=false");
	} catch (SQLException e) {
		e.printStackTrace();
		
	}
		return conn;
}
}
