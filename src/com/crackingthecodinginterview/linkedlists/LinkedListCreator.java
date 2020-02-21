package com.crackingthecodinginterview.linkedlists;

class Node{
	Node next = null; 
	int data; 
	
	public Node(int data)
	{
		this.data = data;
	}
	
	void appendToTail(int data)
	{
		Node end = new Node(data); 
		Node n = this; 
		while(n.next!=null)
		{
			n = n.next;
		}
		n.next = end; 	
	}
	
	Node deleteNode(Node head, int data)
	{
		Node n = head;
		
		if(n.data == data)
			return head.next; //move head
		
		while(n.next!=null)
		{
			if(n.next.data == data)
			{
				n.next = n.next.next;
				return head;
			}
			n =n.next;
		}
		
		return head;
	}
	
}

public class LinkedListCreator {

}
