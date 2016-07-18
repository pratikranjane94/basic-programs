package com.DataStructure.Sorted;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//import com.DataStructure.Sorted.Node;

public class NodeFunctionsSorted {
	Node head;
	Node tail;

	public NodeFunctionsSorted readFile(String filePath) // create array by reading file
	{
		String list[];
		NodeFunctionsSorted n2 = new NodeFunctionsSorted();
		try {
			File file = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(file));
			// reading file
			String s = br.readLine();
			list = s.split(" ");

			for (String s1 : list) {
				System.out.println(s1);
				n2.add(Integer.parseInt(s1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n2;
	}

	public void add(int value) {
		Node n = new Node();
		n.setValue(value);// set value of node
		Node temp = head;
		Node prev = head;
		boolean ins = false;
		// if list is empty make it head and tail
		if (head == null) {
			head = n;
		} else {
			if (value < head.getValue()) {
				n.setNext(head);
				head = n;
			}

			else {
				while (temp.getNext() != null) {
					if (value >= temp.getValue() && value <= prev.getValue()) {
						temp.setNext(n);
						n.setNext(prev);
						ins = true;
						break;
					} else {
						temp = prev;
						prev = prev.getNext();
					}
				}
				if (ins == false) {
					temp.setNext(n);
				}
			}

		}
	}

	public void showList() {
		Node temp = head;
		// if linked list is empty
		if (temp == null)
			System.out.println("List is null");
		else {
			while (temp != null)// display linked list
			{
				System.out.println("Value:" + temp.getValue());
				temp = temp.getNext();
			}
		}
	}

	public boolean search(int search)	//search for item
	{
	  Node temp=head;
	  if(temp==null)
	     return false;
	  while(temp!=null)
	  {
	    if(search==temp.getValue())
	    {
	      return true;
	    }
	    temp=temp.getNext();
	  }
	  return false;
	}//end of searchList
	
	public int size()
	{
	   int count=0;
	   Node temp=head;
	   if(temp==null)
	      return count;
	   else
	      while(temp!=null)
	      {
	         count++;
	         temp=temp.getNext();
	      }
	   return count;
	}//end of size()

	//return true if list is empty
	public boolean isEmpty()
	{
	  if(head==null)
	    return true;
	  else
	    return false;
	}//end isEmpty()
	
	public int index(int value)
	{
	  Node temp=head;
	  int count=0;
	  if(temp==null)
	    return count;
	  else
	    while(temp!=null)
	    {
	      count++;
	      if(value==temp.getValue())
	      {
	        return count;
	      }
	      temp=temp.getNext();
	    }
	  return -1;
	}
	
	public void remove(int value)
	{
		Node n=new Node();
		Node temp=head;
		Node previous=head;
		if(temp==null)
			System.out.println("Cannot remove");
		else 
		{
		while(value!=temp.getValue())
		{
				previous=temp;
				temp=temp.getNext();
		}
			if(temp==head)
			{
				head=head.getNext();
				temp.setNext(null);
			}
			else
		    {   
		      previous.setNext(temp.getNext());
		      temp.setNext(null);
		    }
		}
	}
}
