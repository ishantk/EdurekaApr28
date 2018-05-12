interface Inf1{
	int i = 10;  // public static final int i = 10;
	void show(); // public abstract void show();
}

interface Inf2{
	void fun(); // public abstract void fun();
}

// Multiple Inheritance on Interfaces
interface Inf3 extends Inf1,Inf2{
	void hello();
}

class CA implements Inf3{//Inf1,Inf2{ // Multiple Implementation
	
	public void show(){
		System.out.println("This is show");
	}
	
	public void fun(){
		System.out.println("This is fun");
	}
	
	public void hello(){
		System.out.println("This is hello");
	}
}

/*class X{
	
}

class Y{
	
}

class CB extends X,Y{ // error
	
}*/

public class IntrfaceDemo {

	public static void main(String[] args) {
		
		// Ref Var of interface can point to the object implementing it !!
		//Inf1 i1 = new CA(); // Polymorphic Statement
		//i1.show();
		//i1.fun(); //err
		
		//Inf2 i2 = new CA();
		//i2.fun();
		//i2.show(); // err
		
		/*CA ca = new CA();
		ca.fun();
		ca.show();*/

		Inf3 i3 = new CA();
		i3.fun();
		i3.show();
		i3.hello();
		System.out.println("i is: "+Inf3.i);
		
	}

}
