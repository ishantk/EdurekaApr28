package co.edureka.collections;

class Outer{
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Nested or inner Class. | Object in an Object
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
	
	private class A{
		
	}
	
	protected class B{
		
	}
	
	public class C{
			
	}
	
	class D{
		
	}
	
	interface Inf{
		
	}
	
	void fun(){
		
		// Local Class
		class L{
			void hello(){
				System.out.println("This is hello");
			}
		}
		
		L l = new L();
		l.hello();
	}
}


public class InnerClass {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		oRef.fun();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();

	}

}
