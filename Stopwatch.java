import com.Utility.Utility;
import java.util.Scanner;
class Stopwatch
{
	public static void main(String args[])
	{
		String start;
		long elapsed;

		Utility u=new Utility();
		Scanner sc=new Scanner(System.in);

		System.out.println("To Start press y and enter and to stop n");
		start=sc.next();

		//call to elapsedTime to start stopwatch
		elapsed=u.elapsedTime();
		System.out.println("Elapsed time:" +elapsed+ "Seconds");
	}
}
