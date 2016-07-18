import java.util.Scanner;
class Stock
{
public static void main(String args[])
{
	int no,i;
	Scanner sc=new Scanner(System.in);
	//getting no of stocks
	System.out.println("Enter no of stocks:");
	no=sc.nextInt();
	//creating array of StockPort class
	StockPort sp[]=new StockPort[no];
	//getting details of no of stocks
	for(i=0;i<no;i++)
	{
			System.out.println("Enter"+(i+1)+"stStock details:");
			//creating objects for each stock
			sp[i]=new StockPort();
	}
	//displaying report for all stock
	System.out.println("Stock Report:");
	System.out.println("name \t share \t price \t totalValue");
	for(i=0;i<no;i++)
	{
			sp[i].displayReport();
	}
}
}
