package EstablishConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class EstablishConnection {
	public static void main(String[] args) {
		String query="update userinfo set upwd=54321 where umobile=9494013905 ";
		try {
			/*establish connection b/w java application and database application*/
			Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","12345");
			System.out.println("connection establised");
			/*Create a platform*/
			java.sql.Statement stmt =connection.clientPrepareStatement(query);
			System.out.println("query carry");
			int update=stmt.executeUpdate(query);
			System.out.println("updated records are "+ update );
		
			
			connection.close();
			System.out.println("connection close");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
