package com.crackingthecodinginterview.linkedlists;

public class LoopDetector {
	
	Node findLoopBegin(Node head)
	{
		Node ptrSlow = head; 
		Node ptrFast = head; 
		
		while(ptrFast!= null || ptrFast.next!=null)
		{
			ptrSlow = ptrSlow.next; 
			ptrFast = ptrFast.next.next;
			if(ptrSlow == ptrFast)
			{
				ptrSlow = head;
				while(ptrSlow != ptrFast)
				{
					ptrSlow = ptrSlow.next; 
					ptrFast = ptrFast.next; 
				}
				return ptrSlow;
			}
		}
		
		return null;
	}

}