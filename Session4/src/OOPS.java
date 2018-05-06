// Describing the Object
class Employee{
	
	// Attributes or State of an Object
	int eid;
	String name;
	String email;
	String phone;
	long salalry;
	
	// Special Method Created by Compiler if you do not create it - Constructor
	// Same Name as of Class Name and no Return Type !!
	
	// Default Constructor
	/*Employee(){
		eid = 0;
		name = null;
		email = null;
		phone = null;
		salalry = 0;
	}*/
	
	// If you create yourself.. Compiler wont create it
	// Whenever object will be constructed, constructor will be executed 
	Employee(){
		eid = 1;
		name = "NA";
		email = "NA";
		phone = "NA";
		salalry = 10000;
	}
	
	// Overloading of Constructor
	// Paramtereized Constructor
	Employee(int e, String n, String em, String p, int s){
		eid = e;
		name = n;
		email = em;
		phone = p;
		salalry = s;
	}
	
	// Methods or Behavior of an Object
	void setEmployeeDetails(int e, String n, String em, String p, int s){
		eid = e;
		name = n;
		email = em;
		phone = p;
		salalry = s;
	}
	
	void showEmployeeDetails(){
		System.out.println(eid+" "+name+" withdraws \u20b9"+salalry+" salary");
	}
	
}

public class OOPS {

	public static void main(String[] args) {
							 // Execution of Constructor
		Employee eRef1 = new Employee();
		Employee eRef2 = new Employee();
		Employee eRef3 = new Employee();
		Employee eRef4 = new Employee(301,"Jack","jack@example.com","+91 787878787",90000);
		
		// Writing data into object directly
		eRef1.eid = 101;
		eRef1.name = "George";
		eRef1.email = "george@example.com";
		eRef1.phone = "+91 9090909090";
		eRef1.salalry = 50000;

		// Reading data from Object
		System.out.println(eRef1.eid+" "+eRef1.name+" withdraws \u20b9"+eRef1.salalry+" salary");
		
		// Writing the data into object through a method (indirectly)
		eRef2.setEmployeeDetails(102, "Fionna", "fionna@example.com", "+91 9090921212", 70000);
		
		// Reading data from Object through a method
		eRef2.showEmployeeDetails();
		
		eRef3.name = "Harry";
		// Reading data from Object through a method without writing the data !!
		eRef3.showEmployeeDetails();
		
		eRef4.showEmployeeDetails();
	}

}
