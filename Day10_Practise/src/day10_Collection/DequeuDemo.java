package day10_Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuDemo {

	public static void main(String[] args) {
		Deque<Integer> deque=new ArrayDeque<>();
		deque.add(15);
		deque.add(16);
		deque.add(17);
		System.out.println(deque);
		// Adding Element at Start position
		deque.addFirst(19);
		// Adding Element at Last position
		deque.addLast(56);
		System.out.println(deque);
		
		
	}

}
