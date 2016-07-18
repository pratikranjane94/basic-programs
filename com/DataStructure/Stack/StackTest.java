package com.DataStructure.Stack;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter expression:");
	sc.next();
	Stack<String> s=new Stack<>();
	s.push("(");
	s.push("1");
	//s.push("2");
	//s.push(")");
	s.pop();
	s.pop();
	s.pop();
	s.showList();
	}

}
