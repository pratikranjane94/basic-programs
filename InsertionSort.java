import com.Utility.Utility;
import java.util.Scanner;
class InsertionSort
{
	public static void main(String args[])
	{
		int no;
		String list[];
		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);
		//getting size of array of strings
		System.out.println("Enter size of list of elements: ");
		no=sc.nextInt();
		//adding no strings to array
		list=u.addStrings(no);
		//displaying unsorted list 
		System.out.println("List of elements before sorting ");				
		for(String s:list)
		{
			System.out.println(s);		
		}
		u.insertionSort(list,no);
		//displaying sorted list 
		System.out.println("List of elements after sorting ");				
		for(String s:list)
		{
			System.out.println(s);		
		}
	}
}
