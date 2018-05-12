
public class BlockDemo {
	
	int a;
	static int b;

	BlockDemo(){
		//a = 10;
		System.out.println("==BlockDemo Constructor==");
	}
	
	// Initializer Block | Executed before constructor | Linked with Object
	{
		//a = 10;
		System.out.println("==This is a Block1==");
	}
	
	{
		System.out.println("==This is a Block2==");
	}
	
	// Static Initializer Block | Linked with Class
	static{
		b  = 100;
		System.out.println("==This is a static Block1==");
	}
	
	public static void main(String[] args) {
		System.out.println("==Main Started==");
		
		BlockDemo bRef1 = new BlockDemo();
		
		System.out.println("********************");
		
		BlockDemo bRef2 = new BlockDemo();
		
		System.out.println("==Main Finished==");
	}

}
