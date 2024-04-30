package FatchData;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/*wap to fetch data from userinformation table if given 
 * mobile no 9494013905 is given mobile no is present database
 * if mobile no is not present in data base then print invaild mobile
 * on to the console*/
public class PhoneNumber {
	public static void main(String[] args) {
		try {
			java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","12345");
			System.out.println("step 1");
			java.sql.Statement stmt=connection.prepareStatement("select * from userinfo where umobile=9494013905 ");
			System.out.println("step 2");
			ResultSet rs=stmt.executeQuery("select * from userinfo where umobile=9494013905 ");
			
			boolean status=rs.next();
			if(status) {
				String name=rs.getString("uname");
				System.out.println("user name "+name);
				
				String pass=rs.getString("upwd");
				System.out.println("user password "+pass);
				
				String mail=rs.getString("uemail");
				System.out.println("user email "+mail);
				
				String phone=rs.getString("umobile");
				System.out.println("user mobile "+phone);
			}
				
				
				else {
					System.out.println("give number is invalid ");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
