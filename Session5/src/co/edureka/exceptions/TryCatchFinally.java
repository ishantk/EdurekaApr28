package co.edureka.exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		System.out.println("==Main Started==");

		int[] arr = {10,20,30,40,50};
		int a=10,b=0,c=0;
		
		try{
			
			// S1
			System.out.println("arr[3] is: "+arr[3]);
			/*try{
				System.out.println("arr[30] is: "+arr[30]);
			}catch(ArrayIndexOutOfBoundsException aRef){
				System.out.println("Some Exception: "+aRef);
			}*/
			
			// S2
			c = a/b;
			
			// S3
			System.out.println("This must be executed !!");
			
		}catch(Exception e){ // RTP
			System.out.println("Some Exception: "+e);
		}finally{
			System.out.println("This must be executed !!");
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			//System.out.println("Some Exception Occurred !!");
			System.out.println("Some Exception: "+aRef);
			//aRef.printStackTrace();
		}catch(ArithmeticException aRef){
			//System.out.println("Some Exception Occurred !!");
			System.out.println("Some Exception: "+aRef);
			//aRef.printStackTrace();
		}*/
		
		
		System.out.println("c is: "+c);
		
		System.out.println("This is Awesome");
		
		System.out.println("==Main Finished==");

	}

}
