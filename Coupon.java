import com.Utility.Utility;

import java.util.Random;
import java.util.Scanner;
class Coupon
{
private static int no;
private static int j,ran,i;
private static int list[]=new int[no];
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
no=sc.nextInt();
Coupon c=new Coupon();
generateCoupon(no);
}
public static void generateCoupon(int no)
{
Random r=new Random();
for(i=0;i<no;i++)
{
ran=r.nextInt(50);
if(!(isExist(ran)))
{
for(j=0;;j++)
{
list[j]=ran;
System.out.println(list[j]);
}
}
}
}


public static boolean isExist(int ran)
{
for(i=0;i<no;i++)
{
if(list[i]==ran)
return true;
}
return false;
}

}

