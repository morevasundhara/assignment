package assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.runners.model.Statement;

class User {
    String email;
    String password;

    public User(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }
}

public class Code {

	public static boolean email(String email,String pass) throws SQLException, ClassNotFoundException {

		boolean userfound=false;
		List<User> userlist=new ArrayList<>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root123");
		java.sql.Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("select * from user");
		
		while(rs.next()) {
			System.out.println(rs.getString("email") + " "+ rs.getString("password"));
		   userlist.add(new User(rs.getString("email"), rs.getString("password")));
		}
		
		for(User u: userlist) {
			if(u.email.equals(email)&&u.password.equals(pass)) {
				userfound=true;
			}
		}
		return userfound;
		
		
	 
	}

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	System.out.println(Code.email("vasundhara134@gmail.com", "vasu1234"));	
		
	}
}
