// Textual Representation of User Object
// how an Object will look like in the memory
class User{
	
	// Attributes of an Object and not of class
	// Property of Object
	String name;
	String email;
	long phone;
	private int age;
	char gender;
	String address;
	
	// Methods of an Object and not of class
	// Property of Object
	void setAge(int a){
		age = a;
	}
	
	int getAge(){
		return age;
	}
}


public class ObjectDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int[] arr = {10,20,30,40,50};
		
		// Object Construction Statement
		// new will create User Object i.e. a BOX in the HEAP Area at RUN TIME
		// u1 is a Reference Variable and not an object. u1 stores the address of the Object created in the Heap
		User u1 = new User();
		User u2 = new User();
		User u3 = u1; // Reference Copy
		
		System.out.println("a is: "+a);
		System.out.println("arr is: "+arr);
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);
		System.out.println("u3 is: "+u3);
		
		// Write Data in Object | With the help of reference variable and . operator
		u1.name = "John";
		u1.email = "john@example.com";
		//u1.age = 10;
		u1.setAge(10);
		u1.phone = 9090909090l;
		u1.gender = 'M';
		u1.address = "Redwood Shores";
		
		u2.name = "Jennie";
		u2.email = "jennie@example.com";
		//u2.age = 20;
		u2.setAge(20);
		u2.phone = 9790789090l;
		u2.gender = 'F';
		u2.address = "Country Homes";
		
		// Read the data from Object
		//System.out.println(u1.name+" is "+u1.age+" years old and lives in "+u1.address);
		//System.out.println(u2.name+" is "+u2.age+" years old and lives in "+u2.address);
		//System.out.println(u3.name+" is "+u3.age+" years old and lives in "+u3.address);
		
		System.out.println(u1.name+" is "+u1.getAge()+" years old and lives in "+u1.address);
		System.out.println(u2.name+" is "+u2.getAge()+" years old and lives in "+u2.address);
		System.out.println(u3.name+" is "+u3.getAge()+" years old and lives in "+u3.address);
		

	}

}
