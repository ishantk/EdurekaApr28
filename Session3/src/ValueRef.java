
public class ValueRef {
	
	
	void showValue(int x){ // Value as an Input
		System.out.println("x in showValue is: "+x);
		System.out.println("x is: "+x);
	}
	
	void showArray(int[] x){ // Reference as an Input. x is a ref var which will hold the address
		System.out.println("x in showArray is: "+x);
		for(int e : x){
			System.out.print(e+"  ");
		}
		x[3] = 350;
	}
	

	public static void main(String[] args) {
		
		int a = 10; // a is a single value storage container. a will hold the VALUE 10.
		int[] arr = {10,20,30,40,50}; // arr is a multi value container. arr will hold some ADDRESS VALUE.
		
		System.out.println("a is: "+a);
		System.out.println("arr is: "+arr);
		
		int b = a;				// Value Copy
		int[] brr = arr; 		// Reference Copy
		
		System.out.println("b is: "+b);
		System.out.println("brr is: "+brr);
		
		ValueRef vr = new ValueRef();
		vr.showValue(a);	// Calling the method by passing a VALUE
		vr.showArray(arr);  // Calling the method by passing REFERNCE

		System.out.println();
		
		System.out.println("arr[3] is: "+arr[3]);
		System.out.println("brr[3] is: "+brr[3]);
		
	}

}
