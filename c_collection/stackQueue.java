package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackQueue {

	public static void main(String[] args) {

		
		//1. 스택  
		Stack s = new Stack();
		s.push("A");	//스택에 무언가를 넣을 때 push
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());	//스택애서 무언가를 뽑을 때 pop
		
		
		//2. 큐 : Interface, 선착순
		Queue q = new LinkedList();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		System.out.println(q.poll());
	}

}
