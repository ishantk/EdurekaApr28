package co.edureka.exceptions;

public class ExcDemo {

	public static void main(String[] args) {
		System.out.println("==Main Started==");

		int[] arr = {10,20,30,40,50};
		try{
			System.out.println("arr[30] is: "+arr[30]);
		}catch(ArrayIndexOutOfBoundsException aRef){
			//System.out.println("Some Exception Occurred !!");
			System.out.println("Some Exception: "+aRef);
			//aRef.printStackTrace();
		}
		
		int a=10,b=0,c=0;
		
		try{
			c = a/b;
		}catch(ArithmeticException aRef){
			System.out.println("Some Exception Occurred !!");
		}
		
		System.out.println("c is: "+c);
		
		System.out.println("This is Awesome");
		
		System.out.println("==Main Finished==");
	}

}
