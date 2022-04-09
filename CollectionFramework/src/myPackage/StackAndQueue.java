package myPackage;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackAndQueue {

	public static void main(String[] args) {
		//LIFO Stack
		/*
		Stack<Integer> data = new Stack<Integer>();
		
		data.push(1);
		data.push(90);
		data.push(100);
		System.out.println(data.size());
		System.out.println(data.pop());
		System.out.println(data.size());
		System.out.println(data.peek());
		*/
		
		//FIFO Queue
		PriorityQueue<Integer> obj=new PriorityQueue<Integer>();
		obj.add(50);
		obj.add(90);
		obj.add(200);
		obj.add(60);
		System.out.println(obj.poll());
		System.out.println(obj.element());

	}

}
