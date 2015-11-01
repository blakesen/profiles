package Profiles;

import java.sql.Timestamp;

class Transaction {
	public String userId;
	public String product;
	public String category;
	public int quantity;
	public double price;
	public String address;
	public String zipcode;
	public Timestamp ts;
	
	public Transaction(){
		this("","","",0,0.0,"","", null);
	}
	public Transaction(String userId, String product, String category, 
				int quantity, double price, String address, String zipcode,
				Timestamp ts){
		this.userId = userId;
		this.product = product;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.address = address;
		this.zipcode=zipcode;
		this.ts = ts;
	}

	
	
	
}
