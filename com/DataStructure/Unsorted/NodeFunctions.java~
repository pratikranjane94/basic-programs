package com.DataStructure.Unsorted;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

class NodeFunctions<T>
{
	Node<T> head;
	Node<T> tail;
	//add strings to linked list
	public void add(T value)
	{
		Node<T> n=new Node<T>();
		n.setValue(value);//set value of node
		System.out.println("Added :"+value);
		//if list is empty make it  head and tail
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			tail.setNext(n);//set current tails next reference to next node
			tail=n;//sets new node as tail
		}
	}

	public void showList()
	{
		Node<T> temp=head;
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
	
	public NodeFunctions readFile(String filePath)	//create array by reading file 
	{
	char ch;
	String list[];
	String sentence="";
	NodeFunctions<String> n=new NodeFunctions<String>();
	try
	{
		File file = new File(filePath);							
		//FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(new FileReader(file));
		//read file
		String s=br.readLine();
		list=s.split(" ");
		for (String s1:list) {
			System.out.println(s1);
			n.add(s1);	
		}
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
	return n;
	}
	
	public void addAfter(T after,T value)	//insert value after particular position
	{
		int flag=0;
		Node temp=head;
		Node temp2;
		Node<T> n=new Node<T>();
		n.setValue(value);
		while(temp!=null)
		{
		if(temp.getValue().equals(after))
		{
			temp2=temp.getNext();
			temp.setNext(n);
			n.setNext(temp2);
			System.out.println("Added:"+value);
			flag=1;
			break;
		}
		temp=temp.getNext();
		}
		if(flag==0)
			System.out.println(after+": Not Found");
	}
	public void insertAfter(int pos,T value)	//insert value after particular position
	{
		int flag=0;
		Node<T> n=new Node<T>();
		Node<T> temp=head;
		Node<T> temp2;
		int count=1;
		n.setValue(value);
		if(temp==null)//list is empty
		{
			if(count==pos)//position is 1st
				head=n;		
		else
			System.out.println("List is Empty");
		}//end if
		else
		{
		while(temp!=null)
		{
			if(pos==count)
			{
				temp2=temp.getNext();
				temp.setNext(n);
				n.setNext(temp2);
				flag=1;
				break;
			}
			else
				flag=0;
			count++;
			temp=temp.getNext();
		}
		}//end else
		if(flag==0)
			System.out.println(pos+": Not Found");
	}//end method
	
	public boolean search(T search)	//search for item
	{
	  Node<T> temp=head;
	  if(temp==null)
	     return false;
	  while(temp!=null)
	  {
	    if(search.equals(temp.getValue()))
	    {
	      return true;
	    }
	    temp=temp.getNext();
	  }
	  return false;
	}//end of searchList
	
	//return the size of list
	public int size()
	{
	   int count=0;
	   Node<T> temp=head;
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
	
	public int index(T value)
	{
	  Node<T> temp=head;
	  int count=0;
	  if(temp==null)
	    return count;
	  else
	    while(temp!=null)
	    {
	      count++;
	      if(value.equals(temp.getValue()))
	      {
	        return count;
	      }
	      temp=temp.getNext();
	    }
	  return -1;
	}
	public void remove(T value)
	{
		Node<T> n=new Node<T>();
		Node<T> temp=head;
		Node<T> previous=head;
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




















