package com.DataStructure.Sorted;

import java.util.Scanner;

public class OrderedList {

	public static void main(String[] args) 
	{
		int search;
		Scanner sc=new Scanner(System.in);
		NodeFunctionsSorted n=new NodeFunctionsSorted();
		n=n.readFile("/home/bridgelabz6/Downloads/opt/eclipse-installer/scraper/BasicProgram/src/com/DataStructure/Sorted/new.txt");
		n.showList();
		System.out.println(n.search(8));
		System.out.println(n.size());
		System.out.println(n.index(8));
		System.out.println("Enter word to be search:");
		search=sc.nextInt();
		if(n.search(search))
		n.remove(search);
		else
			n.add(search);
		n.showList();
	}
}
