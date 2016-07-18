package com.DataStructure.Sorted;
class Node
{
	private int value;
	private Node next;
	//returns node value
	public int getValue()
	{
		return value;
	}
	//returns next node reference
	public Node getNext()
	{
		return next;
	}
	//set node value
	public void setValue(int value)
	{
		this.value=value;
	}
	//set node reference
	public void setNext(Node next)
	{
		this.next=next;
	}

}
