
public class ArrayDemo {

	public static void main(String[] args) {
		
		// Single Value Containers
		int arizonaDem = 126;
		int arizonaRep = 152;

		int floridaDem = 32;
		int floridaRep = 85;
		
		int vermontDem = 230;
		int vermontRep = 121;
		
		// Multi value Container - Array
							 // 0    1   2   3    4
		int[] demVoteCount = { 126, 32, 230, 21, 200 }; //.......
		int[] repVoteCount = { 152, 85, 121, 215, 30 };
		
		System.out.println("florida dem votes are : "+floridaDem);
		System.out.println("florida dem votes are : "+demVoteCount[1]);
		
		// error if you add any other type of data | int[] arr1 = {10,20,30,40,50, 2.2f}; // 2.2f is an error
		// Arrays store data of same type i.e. Homogeneous Nature
		int[] arr1 = {10,20,30,40,50}; 
		System.out.println("arr1 is: "+arr1); // ? 
		
		
		int i = 10;
		System.out.println("i is: "+i);
		
		// arr1 is a reference variable which will hold the address for array | MVC
		// i is containing the value										  | SVC
		
		
		// Read operation of Array
		System.out.println("arr1[0] is: "+arr1[0]);
		System.out.println("arr1[3] is: "+arr1[3]);
		
		System.out.println("====for loop====");
		for(int idx=0;idx<5;idx++){ // less than 5 means till 4
			System.out.println("arr1["+idx+"] is: "+arr1[idx]);
		}
		
		int[] arr2 = {12,3,12,54,6,78,89,12,34,56,20};
		
		System.out.println("====enhanced for loop===="); // for each loop
		for(int elm : arr2){
			System.out.println(elm);
		}
		
	}

}
