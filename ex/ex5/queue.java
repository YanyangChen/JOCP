package ex5;
import java.util.*;
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> myqueue = new PriorityQueue<String>();
		myqueue.add("Vincent");
		myqueue.add("Peter");
		myqueue.add("Tom");
		System.out.print("Items in queue (not showing in retrieval order):");
		System.out.println(myqueue);
		System.out.println("Polling : " + myqueue.poll());
		System.out.println("Peek : " + myqueue.peek() );
		System.out.println("Polling : " + myqueue.poll());
		myqueue.add("Ann");
		System.out.println("Polling (after Ann added) : " + myqueue.poll());
		myqueue.add("Wilson");
		System.out.println("Polling (after Wilson added) : " + myqueue.poll());
		System.out.println("Polling : " + myqueue.poll());
		System.out.println("Polling : " + myqueue.poll());
		
		ArrayDeque<String> myqueue2 = new ArrayDeque<String>();

		myqueue2.addLast("Vincent");
		myqueue2.addLast("Peter");
		myqueue2.addLast("Tom");
		myqueue2.addFirst("Sunny");
		        
		System.out.print("Items in queue : ");
		System.out.println(myqueue2);

		System.out.println("Peek : " + myqueue2.peekLast() );
		System.out.println("Polling : " + myqueue2.pollFirst());
		System.out.println("Polling : " + myqueue2.pollFirst());
		System.out.println("Polling : " + myqueue2.pollFirst());
		System.out.println("Polling : " + myqueue2.pollFirst());
	}

}
