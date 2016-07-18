import com.Utility.Utility;
import java.util.Scanner;
class PrimeFactorization
{
public static void main(String args[])
{	
	int no;
	Scanner sc=new Scanner(System.in);
	Utility u=new Utility();

	System.out.println("Enter the no to find Prime Factors:");
	no=sc.nextInt();
	//call to find PrimeFactors
	u.PrimeFactors(no);
}
}
