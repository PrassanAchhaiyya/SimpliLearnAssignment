package myPackage;
class Node{
	public int data;
	public Node next;
}

public class LinkedListClass {
	private Node head;
	public boolean isEmpty() {
		return(head==null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=head;
		head=newNode;
	}
	
	public Node deleteFirst()
	{
		Node temp=head;
		head=head.next;
		return temp;
	}
	public void printLinkedList() {
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}

}
