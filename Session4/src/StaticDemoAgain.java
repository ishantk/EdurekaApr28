class Counter{

	int count;
	static int sCount;
	
	Counter(){
		count = 1;
		sCount = 1;
	}
	
	void incrementCount(){
		count++; // count = count+1
		sCount++; // sCount = sCount+1
	}
	
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("sCount is: "+sCount);
	}
	
}

public class StaticDemoAgain {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		// c1 and c3 points to the same object
		Counter c3 = c1; // reference copy
							  //    c         sc
		c1.incrementCount();  // c1 2 | class 2
		c2.incrementCount();  // c2 2 | class 3
		c3.incrementCount();  // c3 3 | class 4
		
		c2.incrementCount();  // c2 3 | class 5
		c3.incrementCount();  // c3 4 | class 6
		
		c2.incrementCount();  // c2 4 | class 7
		
		Counter.sCount = 100;
							// c     sc
		c1.showCount();     // 2,4   2,7
		c2.showCount();     // 2     2
		c3.showCount();     // 2     2

	}

}
