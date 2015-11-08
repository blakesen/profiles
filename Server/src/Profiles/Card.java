package Profiles;

public class Card {
	
	private String cardNumber;
	private String month;
	private String year;
	private String code;
	
	public Card(String cardNumber, String month, String year, String code){
		this.cardNumber=cardNumber;
		this.month=month;
		this.year=year;
		this.code=code;
	}
	
	private String getCardNumber(){ return cardNumber;}
	private String getYear(){ return year;}
	private String getMonth(){ return month;}
	private String getcode(){ return code;}

}
