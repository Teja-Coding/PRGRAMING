package JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class EstablishConnection {
	public static void main(String[] args) throws SQLException 
		Connection connection=DriverManager.getConnection(url);
		System.out.println("connection established");
		
	}
}
