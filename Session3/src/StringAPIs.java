
public class StringAPIs {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE. They CANNOT CHANGE !! 
		// Like a Constant
		String str1 = "John, Jennie, Jack, Jim, Joe";
		String str2 = str1.toUpperCase(); // A new String will be created in the memory and returned back
		
		System.out.println(str1);
		System.out.println(str2);
		
		// APIs i.e. Built in methods of String class
		
		int length = str1.length();
		System.out.println("Length of "+str1+" is: "+length);
		
		char ch = str1.charAt(length-1);
		System.out.println("ch is: "+ch);
		
		char[] chArr = str1.toCharArray();
		for(char c : chArr){
			System.out.print(c+" ");
		}
		System.out.println();
		
		String str3 = str1.substring(5);
		System.out.println("str3 is: "+str3);
		
		String str4 = str1.substring(5,10); // 5 inclusive and 10 not
		System.out.println("str4 is: "+str4);
		
		String[] names = str1.split(",");
		for(String nm : names){
			System.out.println(nm.trim());
		}

		if(str1.contains("John")){
			System.out.println("John is in str1");
		}
		
		String str5 = str1.replace(",", "=");
		System.out.println("str1 is: "+str1);
		System.out.println("str5 is: "+str5);
		
		int idx = str1.indexOf('o');
		System.out.println("idx is: "+idx);
		
		idx = str1.lastIndexOf('o');
		System.out.println("idx is: "+idx);
		
		idx = str1.indexOf("Jennie");
		System.out.println(idx);
	}

}
