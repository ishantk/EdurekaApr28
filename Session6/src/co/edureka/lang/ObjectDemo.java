package co.edureka.lang;

// Object is a root class in java in lang package
// Every class in java, which you create or you are using as an API is child of Object

class Student{ // extends Object{
	
	public String toString() {
		return "This is Awsome";
	}
	
}

class Employee{
	
}

class Bike{
	
}

class Apple{
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Student sRef = new Student();
		
		Object oRef;
		oRef = new Student();
		oRef = new Employee();
		oRef = new Bike();
		oRef = new Apple();
		
		System.out.println(sRef.getClass());
		System.out.println(sRef.toString());
		System.out.println(sRef);
		System.out.println(sRef.hashCode());
		
		String str = new String("Hello World");
		System.out.println(str); // it wont show the address, rather the value...
		// because toString method is overrided in String class

	}

}
