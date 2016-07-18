import com.Utility.Utility;
import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
	int year;

	Scanner sc=new Scanner(System.in);
	Utility u= new Utility();
	//take year from user
	System.out.println("Enter year:");
	year=sc.nextInt();
		//check the length of the year 
	if(u.checkYearLength(year))
		//if true check whether its a leap year
		u.checkLeap(year);	
	else
		System.out.println("Year should be 4 digit no");	
	}
}

