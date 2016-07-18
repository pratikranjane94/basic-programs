import com.Utility.Utility;
import java.util.Scanner;
class BinarySearch
{
public static void main(String args[])
	{
	Utility u=new Utility();
	int ans,no,power;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n that is 2^n which will be length of array: ");
	no=sc.nextInt();
	//call lto binary search method to find the no
	u.binaryNoSearch(no);
	}
	
}
