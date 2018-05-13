package co.edureka.threads;

class Table{
	
	//public void printTable(int num){
	//synchronized public void printTable(int num){
	public void printTable(int num){
		System.out.println("=====Table of "+num+"=====");
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		System.out.println("========================");
	}
	
	public static void printTableAgain(int num){
		System.out.println("=====Table of "+num+"=====");
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		System.out.println("========================");
	}
	
	void fun(){
		System.out.println("This is fun");
	}
	
	void show(){
		System.out.println("This is show");
	}
}

class MyThread extends Thread{
	
	Table tRef;
	
	MyThread(Table t){
		tRef = t;
	}
	
	public void run() {
		
		// We get a lock acquired over the entire object
		synchronized (tRef) {
			// lock is automatically acquired in the beginning
			tRef.printTable(5);
			tRef.fun();
			tRef.show();
			// lock is automatically released in the end
		}
	}

}

class YourThread extends Thread{
	
	Table tRef;
	
	YourThread(Table t){
		tRef = t;
	}
	
	public void run() {
		synchronized (tRef) {
			tRef.printTable(7);
			tRef.fun();
			tRef.show();
		}
	}

}

// Synchronization is required when multiple threads are working on the same object
// Async behavior is to execute threads together
// Sycn behavior is to execute threads one after the other i.e. in a  sequence

public class SyncDemo {

	public static void main(String[] args) {
			
		Table tRef = new Table(); // Table Object Constructed
		//tRef.printTable(5);
		
		MyThread mRef = new MyThread(tRef);
		YourThread yRef = new YourThread(tRef);
		
		mRef.start();
		yRef.start();
		
	}

}
