package com.DataStructure.Stack;
class Node
{
	private String value;
	private Node next;
	//returns node value
	public String getValue()
	{
		return value;
	}
	//returns next node reference
	public Node getNext()
	{
		return next;
	}
	//set node value
	public void setValue(String value2)
	{
		this.value=value2;
	}
	//set node reference
	public void setNext(Node next)
	{
		this.next=next;
	}

}
