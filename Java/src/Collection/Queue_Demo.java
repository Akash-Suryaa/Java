 package Collection;

import java.util.PriorityQueue;

public class Queue_Demo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--) {
			
			queue.add(i);
			
		}
		System.out.println("The size of the queue is " +queue.size());
		
		queue.peek();
		System.out.println("The head of the queue is " +queue.peek());
queue.poll();
System.out.println("the size after the poll is " +queue.size());
	}

}
