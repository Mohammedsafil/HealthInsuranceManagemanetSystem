package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static final String url = "jdbc:mysql://localhost:3306/health_insurancemanagement_system";
	private static final String username = "root";
	private static final String password = "Safil786$$";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,username,password);
	}
	
	public static void closeConnection(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Error in closing the exception "+e.getMessage());
			}
		}
	}
}
