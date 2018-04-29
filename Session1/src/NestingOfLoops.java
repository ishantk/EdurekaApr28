
public class NestingOfLoops {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++){
			System.out.println("i is: "+i);
			
			for(int j=1;j<=i;j++){
				System.out.print(j+"  ");
			}
			System.out.println();
			System.out.println("===========");
		}
		

	}

}
