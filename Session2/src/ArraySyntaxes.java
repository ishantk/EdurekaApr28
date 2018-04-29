
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		//1.
		int[] arr1 = {10,20,30,40,50}; 			// Implict
		
		//2.
		int[] arr2 = new int[]{10,20,30,40,50}; // Explicit
		
		//3.
		int arr3[] = {10,20,30,40,50}; // bracket goes after
		
		//4.
		int [] arr4 = new int[7]; // Declaring the array with the size and all elements are 0

		// Writing the data
		arr1[2] = 100; // 30 is overwritten with 100
		arr4[2] = 500; // 0 is overwritten with 500
		
		// Read Entire Array
		for(int num : arr1){
			System.out.println(num);
		}
		System.out.println("**********");
		for(int num : arr4){
			System.out.println(num);
		}
		
		int l1 = arr4.length;
		int l2 = arr2.length;
		
		System.out.println(l1+" and "+l2);
		
		int[] a1 = {10,20,30,40,50};
		int i1 = 10;
		
		int[] a2 = a1; // Reference Copy
		int i2 = i1;   // Value Copy
		
		System.out.println("a1 : "+a1);
		System.out.println("a2 : "+a2);
		
		a2[2] = 200;
		
		System.out.println("a1[2] is: "+a1[2]); // 200
		
		char[] ch = {'A','E','I','O','U'};
		double[] dArr = {2.2,3.3,4.4,5.5,6.6};
		
		char[] alphabets = {'A','B','C'}; //.....
		// When we know that size is fixed we use Arrays
		// When the size can vary we will use Collections(ArrayList) in Java
	}

}
