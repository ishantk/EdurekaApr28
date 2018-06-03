package co.edureka.bean;

import java.util.Date;

public class User {
	
	// Attributes...
	String name;
	int age;
	
	// Getters and Setters....
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	// Business Method : Where we process the Logic
	public void loginUser(String email, String password){
		System.out.println("###User Login Process Started###");
		//...
		//...
		// Interacting with JDBC/Hibernate
		
		if(email.equals("admin@example.com") && password.equals("password123")){
			System.out.println("Welcome, Admin "+name);
			System.out.println("Its, "+new Date());
		}
		
		System.out.println("###User Login Process Finished###");
	}
	
}
