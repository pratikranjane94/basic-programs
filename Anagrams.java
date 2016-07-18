import com.Utility.Utility;
import java.util.Scanner;
class Anagrams
{
	public static void main(String args[])
	{
		Utility u=new Utility();
		String str1,str2;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 1st String:");
		str1=sc.next();

		System.out.println("Enter 2nd String:");
		str2=sc.next();
		
		//call to method isAnagram to check whether string is anagram or not
		if(u.isAnagram(str1,str2))
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
	}
}
