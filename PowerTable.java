import com.Utility.Utility;
import java.util.Scanner;
class PowerTable
{
	public static void main(String args[])
	{
		int no;

		Utility u= new Utility();
		Scanner sc=new Scanner(System.in);
		//input from user to generate power table
		System.out.println("Enter power for 2:");
		no=sc.nextInt();
		//validate the input no is in between 1-31
		if(u.validateNo(no))
			//if true calculate power table
			u.powerTable(no);
		else
			System.out.println("Power should be in range of 1-31");
	}
}
