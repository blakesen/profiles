package Profiles;

import java.util.*;

class User {
	
	private String userId;
	private String firstName;
	private String lastName;
	private String address;
	private String zipCode;
	
	private List<Card> cardsInfo;
	
	public User(String userId){
		this(userId, "", "");
	}
	public User(String userId, String firstName, String lastName){
		this(userId, firstName, lastName, "", "");
	}
	public User(String userId, String firstName, String lastName, String address, String zipcode){
		this.userId=userId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.zipCode=zipcode;
		
	}
	
	
	public void setUserId(String userId){ 
		this.userId = userId;
	}
	
	public String getUserId(){return this.userId;}
	
	@SuppressWarnings("static-access")
	public String getUserName(){
		return "%s%s".format(getLastName(), getFirstName());
	}
	
	public void setLastName(String lastName){ 
		this.lastName = lastName;
	}
	
	public String getLastName(){ return this.lastName;}
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	} 
	public String getFirstName(){ return this.firstName;}
	
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){ return this.address;}
	
	public void setZipCode(String zipcode){ 
		this.zipCode = zipcode;
	}
	public String getZipCode(){return zipCode;}
	
	
	
}
