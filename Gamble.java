import com.Utility.Utility;
import java.util.Scanner;
class Gamble
{
	public static void main(String args[])
	{
		Utility u=new Utility();
		int stake,goal,no;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter stake:");
		stake=sc.nextInt();

		System.out.println("Enter goal:");
		goal=sc.nextInt();

		System.out.println("Enter No of attempts:");
		no=sc.nextInt();
		//call to method to play game
		u.playGame(stake,goal,no);
	}


}
