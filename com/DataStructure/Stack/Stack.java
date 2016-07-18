package com.DataStructure.Stack;

import com.DataStructure.Stack.Node;;

public class Stack<T> {
	Node first, top;

	public void push(String value) {
		Node n = new Node();
		Node temp = first;
		n.setValue(value);
		if (temp == null) {
			first=n;
			top=n;
		}
		else
		{
			top.setNext(n);
			top=n;
		}
	}
	public void pop()
	{
		Node n=new Node();
		Node temp=first;
		Node previous=first;
		if(temp==null)
			System.out.println("Cannot remove");
		else 
		{
		while(temp.getNext()!=null)
		{
				previous=temp;
				temp=temp.getNext();
		}
			if(temp==first)
			{
				first=first.getNext();
				temp.setNext(null);
			}
			else
		    {   
		      previous.setNext(temp.getNext());
		      temp.setNext(null);
		    }
		}
	}
	public void showList()
	{
		Node temp=first;
		//if linked list is empty
		if(temp==null)
		System.out.println("List is null");
		else
			{
				while(temp!=null)//display linked list
				{
				System.out.println("Value:"+temp.getValue());			
				temp=temp.getNext();	
				}			
			}
	}
	public boolean isEmpty()
	{
	  if(first==null)
	    return true;
	  else
	    return false;
	}//end isEmpty()
}
