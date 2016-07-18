import com.Utility.Utility;
import java.util.Scanner;
import java.util.Arrays;
class WordSearch
{
public static void main(String args[])
	{
	int no;
	Utility u=new Utility();
	Scanner sc=new Scanner(System.in);
	System.out.println("How many no of words u want to insert:");
	no=sc.nextInt();
	String list[]=new String[no];	
	list=u.addStrings(no);

	//Sorting array of string
	Arrays.sort(list);	
	System.out.println("List of words:");
	
	//display list of strings or words
	for(String s:list)
		{
		System.out.println(s);
		}

	//enter word which is to be searched in list
	System.out.println("Enter word to search:");
	String word=sc.next();
	
	//passing to binary search to find a word
	u.binaryWordSearch(list,word);	
	}
}
