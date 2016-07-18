import com.Utility.Utility;
import java.util.Scanner;
class TwoDArray
{
	public static void main(String args[])
	{
	int m,n,i,j;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter no of rows:");
	m=sc.nextInt();

	System.out.println("Enter no of columns:");
	n=sc.nextInt();

	//creating 2dimensional list
	int list[][]=new int[m][n];
	Utility u=new Utility();

	//returns inserted list
	list=u.put(m,n);

	//Printing array
	System.out.println("Elements you inserted:");
	for(i=0;i<m;i++)	
		{
			for(j=0;j<n;j++)
			{
				System.out.print(list[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

