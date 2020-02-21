package com.crackingthecodinginterview.linkedlists;

class Result {
	int size; 
	Node tail; 
	Result(Node tail, int size){
		this.size = size; 
		this.tail = tail;
	}
}

public class IntersectedLinkedLists {
	Node findIntersection(Node n1, Node n2)
	{
		if(n1 == null || n2 == null) return null; 
		
		Result r1 = getTailAndSize(n1); 
		Result r2 = getTailAndSize(n2); 
		
		if(r1.tail != r2.tail) return null; 
		
		if(r1.size>r2.size) findIntersection(n2, n1);
		
		Node shorter = n1; 
		Node longer = n2; 
		
		longer = getKthNode(longer,r2.size - r1.size);
		
		while(shorter != longer)
		{
			shorter = shorter.next; 
			longer = longer.next;
			if(shorter == null || longer == null) return null;
		}
		
		return longer;
	
	}
	
	Result getTailAndSize(Node n)
	{
		Node temp = n; 
		int size = 1; 
		while(temp.next!=null)
		{
			size++; 
			temp = temp.next;
		}
		return new Result(temp,size);
	}
	
	Node getKthNode(Node n, int k)
	{
		Node tmp = n; 
		for(int i = 0;i<k-1;i++)
		{
			tmp = tmp.next;
		}
		return tmp;
	}
	

}
