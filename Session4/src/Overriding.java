class Father{
	
	void purchaseBike(){
		System.out.println("Lets purchase Bajaj Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets buy Maruti Swift");
	}
}

class Son extends Father{
	
	// Redefining the method of Father Object in Son Object
	
	// Method Overriding
	void purchaseBike(){
		System.out.println("Lets purchase Royal Enfield");
	}
	
	// Method Hiding
	static void purchaseCar(){
		System.out.println("Lets buy Honda City");
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		
		Son sRef = new Son();
		sRef.purchaseBike();
		
		Son.purchaseCar();

	}

}
