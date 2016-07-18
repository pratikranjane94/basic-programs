import com.Utility.Utility;
import java.util.Scanner;
class BubbleSort
{
public static void main(String args[])
	{
	int list[];
	int no;
	Utility u=new Utility();
	Scanner sc=new Scanner(System.in);
	//getting size of elements
	System.out.println("Enter size of elements");
	no=sc.nextInt();
	//add elements in array
	list=u.addInt(no);
	//list before sorting
	System.out.println("List of elements before sorting:");
	for(int j:list)
	{
		System.out.println(j);
	}
	//sort elements
	u.bubbleSort(list,no);

	//list after sorting
	System.out.println("List of elements after sorting:");
	for(int k:list)
	{
		System.out.println(k);
	}
	}
}
