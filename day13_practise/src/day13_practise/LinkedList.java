package day13_practise;

public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		@SuppressWarnings("unused")
		Node(int data){
			this.data=data;	
			Node next=null;
		}
	}
	public static void main(String[] args) {
		LinkedList linkedlist=new LinkedList();
		//create
		linkedlist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		//connect 
		linkedlist.head.next=second;
		second.next=third;
		//print 
		while(linkedlist.head!=null) {
			System.out.println("Value is "+linkedlist.head.data);
			linkedlist.head=linkedlist.head.next;
		}
	}

}
