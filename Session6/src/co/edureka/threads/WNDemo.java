package co.edureka.threads;

class Message{
	
	String msg;
	
	Message(){
		msg = "==No Message Available==";
	}
	
	void writeMessage(String m){
		msg = m;
		System.out.println("==Message Written==");
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
}

class ReaderThread extends Thread{
	
	Message mRef;
	
	public ReaderThread(Message m) {
		mRef = m;
	}
	
	public void run() {
		synchronized (mRef) {
			
			try {
				mRef.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			mRef.readMessage();
		}
	}
	
}

class WriterThread extends Thread{
	
	Message mRef;
	
	public WriterThread(Message m) {
		mRef = m;
	}
	
	public void run() {
		synchronized (mRef) {
			mRef.writeMessage("Work Hard, Get Luckier !!");
			//mRef.notify();
			mRef.notifyAll();
		}
	}
	
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message mRef = new Message();
		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		WriterThread wt = new WriterThread(mRef);
		
		rt1.start();
		rt2.start();
		wt.start();
		
	}

}
