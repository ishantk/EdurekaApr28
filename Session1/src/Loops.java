
public class Loops {

	public static void main(String[] args) {
		
		int num = 7;
		int i = 18;
		
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // 2
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		System.out.println("======While Loop======");
		
		// Condition Checking is at Entry Level
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println("======Do While Loop======");
		num = 9;
		i = 18;

		// Condition Checking is at Exit Level
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10);
		
		int sum1=0, sum2=0;
		i = 1;
		while(i<=10){
			if(i%2 == 0){
				sum1 = sum1+i;
			}else{
				sum2 += i; // sum2 = sum2+i;
			}
			i++;
		}
		
		System.out.println("Sum of 1st 10 Even Nums is "+sum1);
		System.out.println("Sum of 1st 10 Odd Nums is "+sum2);
		
		
		System.out.println("======For Loop======");
		num = 6;
		// Condition Checking is at Entry Level and Everything is mentioned in a single instruction
		for(int j=1;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}

	}

}
