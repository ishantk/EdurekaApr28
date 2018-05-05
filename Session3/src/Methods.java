
public class Methods {

	void funOne(int a, int b){
		int c = a+b;
		System.out.println("c is: "+c);
		
		funTwo(c);
	}
	
	void funTwo(int x){
		System.out.println("x is: "+x);
	}
	
	// Stack Data Structure | Push and Pop | LIFO
	// main is also a function which is executed by JVM at first !!
	public static void main(String[] args) {
		
		System.out.println("==main started==");
		
		int a = 10;
		int b = 20;
		
		// To access non static methods
		Methods m = new Methods(); // Object Construction Statement
		m.funOne(a, b);

		System.out.println("==main finished==");
	}

}
