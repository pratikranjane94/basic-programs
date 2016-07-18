import com.Utility.Utility;
import java.util.Scanner;
class HeadTail
{
	public static void main(String args[])
	{
		Utility u=new Utility();
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of times coin to be flipped:");
		no=sc.nextInt();
		//check no is greater than 0
		if(no>0)
			//call to method to calculate percentage of head & tail
			u.countHeadTail(no);
		else
			//if user enter no zero or less than zero
			System.out.println("Enter positive no");
	}
}
