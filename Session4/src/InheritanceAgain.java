class Parent{
	
	// Non static
	String fname;
	String lname;
	int money;
	
	// static
	static String homeName; 
	
	Parent(){
		System.out.println("==Parent Object Constructed==");
		fname = "John";
		lname = "Watson";
		money = 100000; 
	}
	
	void show(){
		//....
	}
	
	static void showHome(){
		System.out.println("Sweet Home is "+homeName);
	}
}

// Constructor and private is not inherited !!
class Child extends Parent{
	
	int vechiles;
	
	Child(){
		System.out.println("==Child Object Constructed==");
		fname = "Jennie";
		vechiles = 3;
	}
	
	void showDetails(){
		System.out.println(fname+" "+lname+" has \u20b9"+money+" wealth and owns "+vechiles+" vehicles");
	}
}


public class InheritanceAgain {

	public static void main(String[] args) {
			
		Child chRef = new Child();
		chRef.showDetails();
		
		Child.homeName = "My Abode";
		Child.showHome();
	}

}
