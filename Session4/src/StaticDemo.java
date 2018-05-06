class User{
	
	// non static is Property of Object
	String name;
	String email;
	
	// static is Property of Class
	static String appName;
	
	// Methods are non static, Property of Object
	void setUserDetails(String n, String e){
		name = n;
		email = e;
	}
	
	void showUserDetails(){
		// Property of class can be accessed by property of object | Their exists only 1 single class User
		System.out.println(name+" is using the app "+appName); 
		System.out.println(name+" can be contacted at "+email);
	}
	
	// Methods are static, Property of Class
	static void setAppDetails(String n){
		appName = n;
	}
	
	// Property of class cannot access the property of object
	static void showAppDetails(){
		//System.out.println("User Details: "+name+" | "+phone); // error , name and phone belongs to which object. its not known here
		System.out.println("App Name: "+appName);
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		
		User u1 = new User();
		User u2 = new User();
		
		// Property of Object is accessible with its reference
		u1.setUserDetails("John", "john@example.com");
		u2.setUserDetails("Jennie", "jennie@example.com");
		
		u1.showUserDetails();
		u2.showUserDetails();
		
		// Property of Class is accessible with Class Name
		User.setAppDetails("Edureka");
		User.showAppDetails();
		
		// Rules for Class Object
		// 1. Object's Reference Variable or Any Method of an Object can access the property of class (provided its not private)
		// 2. Class's Property cannot access the property of an Object
	}

}
