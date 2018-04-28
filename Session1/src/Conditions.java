
public class Conditions {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 20;
		
		// if works in case condition return true
		// else works in case condition returns false
		
		// Normal IF/Else
		if(num1>num2){
			System.out.println(num1+" is greater than "+num2);
		}else{
			System.out.println(num2+" is greater than "+num1);
		}
		
		
		boolean internetConnection = true;
		boolean gpsConnection = false;
		
		// Nested If/Else
		if(internetConnection){
			
			if(gpsConnection){
				System.out.println("You can Navigate in Google Maps");
			}else{
				System.out.println("Please Turn ON the GPS");
			}
			
		}else{
			System.out.println("Turn ON the Internet First !!");
		}

		if(internetConnection && gpsConnection){
			System.out.println("You can navigate in Google Maps");
		}else{
			System.out.println("Please check internet or GPS connectivity !!");
		}
		
		int ph = 20;
		int mt = 30;
		int cm = 20;
		
		int avg = (ph+mt+cm)/3;
		
		// Ladder If/Else
		if(avg>=80){
			System.out.println("Grade A is awarded for average marks "+avg);
		}else if(avg>=60 && avg<80){
			System.out.println("Grade B is awarded for average marks "+avg);
		}else if(avg>=40 && avg<60){
			System.out.println("Grade C is awarded for average marks "+avg);
		}else{
			System.out.println("Grade F is awarded for average marks "+avg+" declared as FAIL");
		}
		
	}

}
