package Profiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Profile {
	public static void conntect(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
			    "jdbc:mysql://localhost/profile", "root", "beep2015");
			Statement statement = con.createStatement();
			statement.executeUpdate("INSERT INTO User(userId, firstName, lastName) " 
			+ "VALUES ('1', 'HaoWei', 'Tseng')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Profile.conntect();
		
	}

}
