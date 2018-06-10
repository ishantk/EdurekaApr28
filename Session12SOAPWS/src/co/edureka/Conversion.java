package co.edureka;

import java.util.Date;

// Web Service
public class Conversion {
	
	// Web Methods
	public int mtrsToCms(int mtrs){
		int cms = mtrs*100;
		return cms;
	}
	
	public int feetsToInches(int feets){
		int inches = feets*12;
		return inches;
	}
	
	public int dollarsToRupees(int dollars){
		int rupees = dollars/67;
		return rupees;
	}

	public String sayHello(String name){
		String hello = "Hey, "+name+"\nIts: "+new Date();
		return hello;
	}
	
	public String registerUser(String email, String password){
		String resp = "Hello, "+email+"\nYour account is created successfully !!";
		return resp;
	}
	
}
