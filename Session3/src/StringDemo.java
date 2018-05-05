
public class StringDemo {

	public static void main(String[] args) {
		
		// Interned Way
		String str1 = "Hello"; // Hello is a String Literal created in the constant pool
		String str2 = "HeLLo";
		
		// Object Way
		String str3 = new String("Hello"); // Hello is stored in a String Object created in Heap area
		String str4 = new String("Hello");
		
		// str1, str2, str3 and str4 are reference variables. they hold address values.
		// but when we print these reference variables we cannot see the address but we see the value. (This is MAGIC)
		
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		
		// Comparing Addresses as Strings are References Here
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		if(str1 == str3){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
		
		// To Compare the Data in String
		
		System.out.println("*************************");
		
		if(str1.equals(str2)){
			System.out.println("str1 equals str2");
		}else{
			System.out.println("str1 not equals str2");
		}
		
		if(str2.equals(str4)){
			System.out.println("str2 equals str4");
		}else{
			System.out.println("str2 not equals str4");
		}
		
		if(str1.equals(str3)){
			System.out.println("str1 equals str3");
		}else{
			System.out.println("str1 not equals str3");
		}
		
		/*if(!str1.equals(str3)){
			System.out.println("str1 equals str3");
		}*/
		
		if(str1.compareTo(str3) == 0){
			System.out.println("str1 compared to str3");
		}else{
			System.out.println("str1 not compared to str3");
		}
		
		System.out.println("******************");
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("str1 equals str2");
		}else{
			System.out.println("str1 not equals str2");
		}
		
		if(str1.compareToIgnoreCase(str2) == 0){
			System.out.println("str1 compared to str2");
		}else{
			System.out.println("str1 not compared to str2");
		}

	}

}
