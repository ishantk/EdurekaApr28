
public class MultiDimArrays {

	public static void main(String[] args) {
								 // indexes represents cities
								 // 0 idx is city1 ....
		int[] populationState1 = {12240,13230,43455,12342,6754,4456};
		int[] populationState2 = {11560,43455,12342,6754};
		int[] populationState3 = {11560,43455,12342,6754,32421};
		
		
		// Represents Array of Array
		int[][] populationCountry = {
										{12240,13230,43455,12342,6754,4456},  //0 -> state1
										{11560,43455,12342,6754},			  //1 -> state2
										{11560,43455,12342,6754,32421}        //2 -> state3
									};	
		
		System.out.println("populationState1 is: "+populationState1);
		System.out.println("populationState1 length is: "+populationState1.length);

		System.out.println("*****************************************");
		
		System.out.println("populationCountry is: "+populationCountry);
		System.out.println("populationCountry length is: "+populationCountry.length);
		
		System.out.println("*****************************************");
		
		System.out.println("populationCountry[1] is: "+populationCountry[1]);
		System.out.println("populationCountry[1] length is: "+populationCountry[1].length);
		
		System.out.println("*****************************************");
		System.out.println(populationCountry[2][2]); // 12342
		
		System.out.println("*****************************************");
		
		int population = 0;
		
		for(int i=0;i<populationCountry.length;i++){ // 3 times, starting from 0 to 2 i.e. 0 1 and 2
			
			for(int j=0;j<populationCountry[i].length;j++){ // when i is 0, j<6, when i = 1, j<4, when i =2, j<5
				
				System.out.print(populationCountry[i][j]+"  ");
				
				population = population + populationCountry[i][j];
				
			}
			
			System.out.println();
		}
		
		System.out.println("Population of country is: "+population);
		
		int a1[][] = new int[3][3]; // 3 1d arrays with 3 elements each !!
		
		int[][] a2 = new int[5][];  // 5 1d arrays with size of arrays not known !!
		a2[0] = new int[5];         // a2's 0th array will have 5 elements
		a2[1] = new int[10];        // a2's 1st array will have 10 elements
		
		// Array of Array of Arrays !! :)
		int[][][] a3 = {
				
							{
								{10,20,30,40,50},
								{10,20,30,},
								{10,20,30,40}
							},
							{
								{10,20,30,40,50},
								{10,20,30,},
								{10,20,30,40}
							}
				
					   };
		
	}

}
