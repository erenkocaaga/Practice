package com.crackingthecodinginterview.linkedlists;

import java.util.HashSet;

public class RemoveDuplicates {
	
	void deleteDups(Node n)
	{
		if(n!=null)
		{
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(n.data);
			
			while(n.next!=null)
			{
				if(set.contains(n.next.data))
					n.next = n.next.next;
				else
					set.add(n.next.data); 
				n = n.next; 
			}	
		}

	}

}
