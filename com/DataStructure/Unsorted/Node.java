package com.DataStructure.Unsorted;
class Node<T>
{
	private T value;
	private Node<T> next;
	//returns node value
	public T getValue()
	{
		return value;
	}
	//returns next node refernce
	public Node<T> getNext()
	{
		return next;
	}
	//set node value
	public void setValue(T value)
	{
		this.value=value;
	}
	//set node reference
	public void setNext(Node<T> next)
	{
		this.next=next;
	}

}
