package Profiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Profile {
	
	private final static String url = "jdbc:mysql://localhost/profile";
	private final static String un = "root";
	private final static String password = "beep2015";
	
	public Profile(){}
	
	public static User getUser(String userId){
		ResultSet rs = execQuery("SELECT * FROM User Where userId ='"+userId+"'");
		User user = new User(userId);
		try {
			
			while(rs.next()){
				user.setFirstName(rs.getString(1));
				user.setLastName(rs.getString(2));
				user.setAddress(rs.getString(3)==null ? "":rs.getString(3));
				user.setZipCode(rs.getString(4)==null ? "":rs.getString(4));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return user;
	}
	
	public static List<Transaction> getTx(String userId){
		List<Transaction> txList = new ArrayList<>();
		ResultSet rs = execQuery("SELECT * FROM Transaction Where userId ='"+userId+"'");
		
		try {
			while(rs.next()){
				String product = rs.getString(2);
				String category = rs.getString(3);
				int quantity = rs.getInt(4);
				double price = rs.getDouble(5);
				String address = rs.getString(6);
				String zipcode = rs.getString(8);
				Timestamp ts = rs.getTimestamp(7);
				
				txList.add(new Transaction(userId, product, category, quantity, price, address, zipcode, ts));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return txList;
	}
	
	public static ResultSet execQuery(String query){
		return execQuery(query, false);
	}
	
	public static ResultSet execQuery(String query, boolean isUpdate){
		
		ResultSet rs = null;
		try {
			Connection con = DriverManager.getConnection(url, un, password);
			Statement statement = con.createStatement();
			
			if(isUpdate)
				statement.executeUpdate(query);
			else
				rs = statement.executeQuery(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public static void main(String[] args){
		List<Transaction> tx = Profile.getTx("2");
		if(tx!=null){
			for(Transaction t:tx)
				System.out.println(t.product+", "+t.price);
		}
		
	}

}
