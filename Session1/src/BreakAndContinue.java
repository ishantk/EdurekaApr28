
public class BreakAndContinue {

	public static void main(String[] args) {
		
		int floors = 10;
		int whiteDoor = 3;
		
		for(int i=1;i<=floors;i++){
			
			System.out.println(i); // i is current floor
			
			if(i==whiteDoor){
				System.out.println("Door Found !!");
				break; // break is a keyword which terminates the loop right away
			}
				
			
		}
		
		System.out.println("*****************");
		
		for(int j=1;j<=10;j++){
			
			if(j<=5){
				continue; // skips the statements below it in a loop and takes the loop in next iteration 
			}
			
			System.out.println("j is: "+j);
		}
		

	}

}
