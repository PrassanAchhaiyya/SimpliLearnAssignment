package myPackage;

public class Stack {
	static final int MAX =10;
	int top;
	int[] a = new int[MAX];
	
	Stack() {
		top=-1;
	}
	
	void push (int data) {
		if(top>=(MAX-1)) {
			System.out.println("Stack overflow");
		}else {
			a[++top]=data;
		}
	}
	int pop() {
		if(top==-1) {
			System.out.println("STACK IS EMPTY");
			return -1;
		}else {
			return a[top--];
		}
	}
	int peek() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return 0;
		}else {
			int x=a[top];
			return x;
		}
	}
	boolean isEmpty()
	{
		return (top<0);
	}
	
	boolean isFull() {
		return (top==MAX-1);
	}

}
