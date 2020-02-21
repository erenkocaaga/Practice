package com.crackingthecodinginterview.linkedlists;

public class PalindromeLinkedList {
	
	boolean isPalindrome(Node head)
	{
		Node clone = reverseAndClone(head); 
		return isEqual(head,clone);
	}
	
	Node reverseAndClone(Node node) {
		Node head = null; 
		while(node!=null)
		{
			Node tmp = new Node(node.data); 
			tmp.next = head;  
			head = tmp;
			node = node.next; 
		}
		return head;
	}
	
	boolean isEqual(Node n1, Node n2)
	{
		while(n1!=null && n2!=null)
		{
			if(n1.data!=n2.data) return false;
			n1 = n1.next; 
			n2 = n2.next; 
		}
		return n1==null&&n2==null;
	}
	

}
