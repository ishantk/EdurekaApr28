import javax.sql.rowset.spi.TransactionalWriter;

/*class Shape{
	
	Shape(){
		System.out.println("Shape Object Constructed...");
	}
	
	// Makes No Sense because every time definition of child will be executed
	void draw(){
		System.out.println("Drawing a Shape...");
	}
	
}*/

// Optimizing the code i.e. RTP
// Abstract class cannot be instantiated. No Objects for Shape
/*abstract class Shape{
	
	Shape(){
		System.out.println("Shape Object Constructed...");
	}
	
	// which has no definition and must be overrided i.e. redefined by the child object
	// has no definition and acts as a RULE or PROTOCOL made by Parent 
	abstract void draw();
	//abstract void fun();
	
	// abstract class can also have normal methods
	void show(){
		System.out.println("This is show");
	}

}*/

//Optimizing the code i.e. RTP
//interfaces : neither you create object nor RTE creates objects
interface Shape{
	
	// interfaces cannot have constructors | neither you create object nor RTE creates objects
	/*Shape(){ 
		System.out.println("Shape Object Constructed...");
	}*/
	
	// which has no definition and must be overrided i.e. redefined by the child object
	// has no definition and acts as a RULE or PROTOCOL made by Parent 
	//abstract void draw();
	//abstract void fun();
	
	// RULE OR PROTOCOL which must be defined in the Child
	void draw(); // public abstract void draw();
	
	// no definitions allowed
	/*void show(){
		System.out.println("This is show");
	}*/
	
}


class Circle implements Shape{//extends Shape{
	
	Circle(){
		System.out.println("Circle Object Constructed...");
	}
	
	// Overridden
	public void draw(){
		System.out.println("Drawing a Circle...");
	}
	
}

class Rectangle implements Shape{//extends Shape{
	
	Rectangle(){
		System.out.println("Rectangle Object Constructed...");
	}
	
	// Overridden
	public void draw(){
		System.out.println("Drawing a Rectangle...");
	}
	
}

class Triangle implements Shape{//extends Shape{
	
	Triangle(){
		System.out.println("Triangle Object Constructed...");
	}
	
	// Overridden
	public void draw(){
		System.out.println("Drawing a Triangle...");
	}
	
}

public class RTP {

	public static void main(String[] args) {
		
		Shape s;
		
		s = new Rectangle(); // Polymorphic Statement : Ref of Parent can point to the object of child
		s.draw(); // Executes Child Version of draw
		
		System.out.println("========================");
		
		s = new Circle();
		s.draw();
		
		System.out.println("========================");
		
		s = new Triangle();
		s.draw();
		//s.show();
		
		// err since Shape is abstract and you cannot create objects
		//s = new Shape(); // Requesting for the object of Shape makes No Sense
		
	}

}
