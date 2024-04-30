package PreparedStatement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Forgot_Password {
	
	public static void main(String[] args) {
		String query="select * from userinfo where umobile=?";
	
	try {
		java.sql.Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","12345");
		
		PreparedStatement ps=(PreparedStatement) connection.prepareStatement(query);
		
		//take the input from user 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mobile number: ");
		
		//assign values for placeholder
		ps.setString(1, sc.next());
		
		ResultSet rs=ps.executeQuery(query);
		if(rs.next()) {
			System.out.println("your password is "+rs.getString("upwd"));
			
		}
		else {
			System.out.println("no records found");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
