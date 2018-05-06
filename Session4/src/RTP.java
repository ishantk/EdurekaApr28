class Cab{
	Cab(){
		System.out.println("==Cab Object Consctructed==");
	}
	
	void bookCab(){
		System.out.println("Booking a Cab");
	}
}

class BasicCab extends Cab{
	BasicCab(){
		System.out.println("==BasicCab Object Consctructed==");
	}
	
	void bookCab(){
		System.out.println("Booking a BasicCab");
	}
}

class LuxCab extends Cab{
	LuxCab(){
		System.out.println("==LuxCab Object Consctructed==");
	}
	
	void bookCab(){
		System.out.println("Booking a LuxCab");
	}
}

class BikeCab extends Cab{
	BikeCab(){
		System.out.println("==BikeCab Object Consctructed==");
	}
	
	void bookCab(){
		System.out.println("Booking a BikeCab");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		/*Cab cRef;
		cRef = new Cab();
		cRef.bookCab();*/
		
		/*BasicCab bRef;
		bRef= new BasicCab();
		bRef.bookCab();*/
		
		// Run Time Polymorphism
		
		Cab cRef;
		
		cRef = new BasicCab(); // Parent's Ref Var is pointing to the object of Child. Polymorphic Statement
		cRef.bookCab();
		
		System.out.println("-------------------------");
		
		cRef = new LuxCab();
		cRef.bookCab();
		
		System.out.println("-------------------------");
		
		cRef = new BikeCab();
		cRef.bookCab();

	}

}
