final class Parent{ // final class cannot be extended
	final void show(){ // final method cannot be overrided by the child
		
	}
}

class Child{ //extends Parent{
	/*void show(){
		
	}*/
}

public class FinalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100;
		
		final int j = 10;
		// j = 100; // final variable's value cannot be modified
		
	}

}
