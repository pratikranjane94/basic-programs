package com.DataStructure.Unsorted;
class UnorderedList
{
	public static void main(String args[])
	{		
		NodeFunctions n2=new NodeFunctions();
		
		//adding word in linked list
		n2=n2.readFile("/home/bridgelabz6/Downloads/opt/eclipse-installer/scraper/BasicProgram/src/com/DataStructure/Unsorted/samp.text");
		System.out.println("-----------------");
		System.out.println("Show list");
		n2.showList();
		
		System.out.println("-----------------");//add after
		System.out.println("Add After list");
		n2.addAfter("my", "mnb");
		n2.addAfter(123, 145);
		
		System.out.println("-----------------");//show list
		System.out.println("Show list");
		n2.showList();
		
		System.out.println("-----------------");//insert after position
		System.out.println("Insert at position");
		n2.insertAfter(7, "value");
		
		System.out.println("-----------------");//show list
		System.out.println("Show list");
		n2.showList();
		System.out.println("-------search----------");//search element
		if(n2.search("name"))
			{
				System.out.println("removed");
				n2.remove("name");
			}
		else
			n2.add("name");
		
		n2.showList();
		
		System.out.println("-----------------");//checking list is empty
		System.out.println("List empty?:"+n2.isEmpty());
		
		System.out.println("-----------------");//getting index of element
		System.out.println("name is present at location:"+n2.index("java"));
		
		System.out.println("-----------------");
		n2.remove("mnb");
	}
}
