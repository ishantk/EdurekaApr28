package co.edureka.lang;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 10; // Primitive Type
		
		// Wrapper Class -> Represents Primitives as Objects

		// BOXING
		Integer iRef = new Integer(i); // Object Construction of Integer
		// Can be passed as a Reference
		
		// UNBOXING
		int j = iRef.intValue(); // Extracting data out of Object
		
		char ch = 'A';
		Character cRef = new Character(ch); // BOXING
		char chr = cRef.charValue(); // UNBOXING

		float f = 2.2f;
		Float fRef = new Float(f); // BOXING
		float g = fRef.floatValue(); // UNBOXING
		
		
		Integer iRef1 = i; // AUTO BOXING   | Integer iRef1 = new Integer(i);
		int k = iRef;      // AUTO UNBOXING | int k = iRef.intValue();
	}

}
