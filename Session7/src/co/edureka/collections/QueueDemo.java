package co.edureka.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
				
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// How we added
		// (head) 10 9 8 7 6 5 4 3 2 1 (tail)
		
		// PriorityQueue Sorts the Data
		// (head) 1 2 3 4 5 6 7 8 9 10 (tail)
		
		//System.out.println(queue.peek());   // return head of the Queue
		
		//System.out.println(queue.poll());   // removes and return head of the Queue
		// (head) 2 3 4 5 6 7 8 9 10 (tail)
		
		for(int i=1;i<=10;i++){
			//System.out.println(queue.peek());
			System.out.println(queue.poll());
		}

	}

}
