package co.edureka.threads;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("##MyTask## "+i);
		}
	}
}*/

class MyTask extends Thread{ // MyTask IS A Thread
	
	// Override method run and define jobs in run method
	public void run(){
		// RUNNABLE IS A STATE WHEN RUN METHOD IS IN EXECUTION
		System.out.println("State of MyTask 1: "+Thread.currentThread().getState());
		
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000); // 1000 milli secs -> 1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println("##MyTask## "+i);
		}
	}
}

class A{
	
}

//class YourTask extends A,Thread{ // Multiple Inheritance isnt supported
class YourTask extends A implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000); // 1000 milli secs -> 1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("$$YourTask$$ "+i);
		}
	}
}

public class ThreadDemo {

	// main method represents jobs of main thread
	public static void main(String[] args) {
		
		System.out.println("==Main Started==");
		
		// Creating the Object of a Thread is a NEW State
		MyTask mRef = new MyTask();
		//mRef.executeTask(); 		// Till Time this task is not finished, below written instructions shall be blocked
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread yRef = new Thread(r);
		
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		yRef.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		mRef.setName("MyThread");
		yRef.setName("YourThread");
		Thread.currentThread().setName("MyMain");
		
		System.out.println("State of MyTask 2: "+mRef.getState());
		
		mRef.start(); // start method internally executes the run method
		// Immediately after the start method on mRef
		try {
			mRef.join(); // Till time MyTask has not finished its jobs, all other threads shall wait !!
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		yRef.start();
		yRef.yield(); // execute others, i will wait (Just a Request)
		
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500); // 1000 milli secs -> 1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("**Main Thread** "+i);
		}
		
		
		System.out.println("MyTask Name: "+mRef.getName()+" Priority "+mRef.getPriority());
		System.out.println("YourTask Name: "+yRef.getName()+" Priority "+yRef.getPriority());
		System.out.println("Main Name: "+Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
		
		
		System.out.println("==Main Finished==");
		// Thread is TERMINATED, when run method is finished
		System.out.println("State of MyTask 3: "+mRef.getState());
	}

}
