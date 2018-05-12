package co.edureka.exceptions;

import java.io.IOException;

// User Defined UNCHECKED Exception
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

//User Defined CHECKED Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int balance = 10000;
	final int minBal = 2000;
	
	int attempts = 0;
	
	void withdraw(int amt){
		
		balance = balance - amt;
		
		if(balance<=minBal){
			
			attempts++;
			
			balance = balance + amt;
			System.out.println("## Withdrawl Failure !! Balance is: \u20b9"+balance+" ##");
			
			// Throwing an UNCHECKED Exception
			if (attempts == 3) {
				//ArithmeticException ae = new ArithmeticException("Illegal Attempts !!");
				//throw ae; // Explicitly Crashing the Program
				
				MyBankingException mb = new MyBankingException("Illegal Attempts !!");
				throw mb;
			}
			
		}else{
			System.out.println("@@ Withdrawl Success !! Balance is: \u20b9"+balance+" @@");
		}
	}
	
	void withdrawAgain(int amt) throws YourBankingException{//throws IOException{
		
		balance = balance - amt;
		
		if(balance<=minBal){
			
			attempts++;
			
			balance = balance + amt;
			System.out.println("## Withdrawl Failure !! Balance is: \u20b9"+balance+" ##");
			
			// Throwing a CHECKED Exception
			if (attempts == 3) {
				//IOException io = new IOException("Illegal Attempts !!");
				//throw io; // Explicitly Crashing the Program
				
				YourBankingException yb = new YourBankingException("Illegal Attempts !!");
				throw yb;
			}
			
		}else{
			System.out.println("@@ Withdrawl Success !! Balance is: \u20b9"+balance+" @@");
		}
	}
}

public class ThrowDemo {

	public static void main(String[] args) {
		System.out.println("==Banking Started==");

		Banking bRef = new Banking();
		
		/*for(int i=1;i<=100;i++){
			bRef.withdraw(3000);
		}*/
		
		try{
			for(int i=1;i<=100;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(YourBankingException yb){
			System.out.println("Exception... "+yb);
		}
		
		
		System.out.println("==Banking Finsihed==");
	}

}
