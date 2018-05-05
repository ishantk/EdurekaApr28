
public class MutableStrings {

	public static void main(String[] args) {
		
		// IMMUTABLE i.e. they remain constant and cannot be modified
		String str = new String("John");
		String str1 = str.concat(" Watson"); // Concatenating a String as in a new String
		//String str1 = str + "Watson";
		
		System.out.println("str is: "+str);
		
		
		// MUTABLE i.e. Contents can be modified
		StringBuffer buffer = new StringBuffer("Jennie");  // THREAD-SAFE (SYNCHRONIZED)
		buffer.append(" Watson");
		
		System.out.println("buffer is: "+buffer);
		
		StringBuilder builder = new StringBuilder("Jack"); // NOT THREAD-SAFE (NOT SYNCHRONIZED)
		builder.append(" Watson");
		
		System.out.println("builder is: "+builder);
		
		//StringBuffer b = "Hello"; // Error

	}

}
