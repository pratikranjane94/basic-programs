import com.Utility.Utility;
import java.util.Scanner;
class Triple
{
	public static void main(String args[])
	{
		int no,i;
		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();

		System.out.println("Enter No of elements you want to enter:");
		no=sc.nextInt();

		//list to store value of array
		int list[]=new int[no];

		//call to values in array
		list=u.addInt(no);

		//finds triple elements
		u.findTriple(list,no);
	}
}
