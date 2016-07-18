package com.Utility;
import java.util.Scanner;
import java.util.Random;

public class Utility
{
Scanner sc=new Scanner(System.in);

//validate username by checking length
public boolean checkLength(String temp)
{
	int length=temp.length();
	if(length<3)
	{
	return false;
	}
	else
	{
	return true;	
	}
}

//replace username in string
public String replaceUsername(String temp)
{
	String uname="Hello username";
	uname=uname.replaceAll("username",temp);
	return uname;
}


//validate the year by checking length of the year
public boolean checkYearLength(int year)
{
	int count=0;
	int rem=year;
	//calculate length of the year
	while(rem!=0)
	{
		rem=rem/10;
		count++;
	}
	//check year entered is of 4 digit
	if(count<4)
	return false;
	else
	return true;
}


//check whether leap year or not
public void checkLeap(int year)
{
	if((year%4)==0)
		System.out.println("Leap Year");
	else
		System.out.println("Not a Leap Year");
}


//Calculate percentage of head and tail
public void countHeadTail(int no)
{
int head=0;
int tail=0;
int i;
float headPer,tailPer;
	Random r=new Random();
	for(i=0;i<no;i++)
	{
		if((r.nextInt(no)%2)< 0.5 ) //creating random no to count head and tail
		{
		head++;
		}
		else
		{
		tail++;
		}
	}
	headPer=head*(100/no);	//calculating percentage of head
	tailPer=tail*(100/no);	//calculating percentage of tail
	System.out.println("No of heads:"+headPer);
	System.out.println("No of tails:"+tailPer);
}


//calculate the  harmonic of no
public float calHarm(int no)
{
	float harmonic=0;
	int i;
	for(i=1;i<=no;i++)
		{
		harmonic=harmonic+(1.0f/i);
		}
	return harmonic;
}


//To calculate prime factors of n no
public void PrimeFactors(int no) 
{
	int factor;
	for(factor=2;factor*factor<=no;factor++)
	{
		while(no%factor==0)
		{
			System.out.println(factor+" ");
			no=no/factor;
		}
	}
	if(no>1)
		System.out.println(no);
}


//play game.Calculate the win and percentage of win and loss
public void playGame(int stake,int goal,int no)
{
	int bets=0,loss=0,wins=0;
	for (int i=0;i<no; i++) 
		{
		int cash = stake;
			while (cash > 0 && cash < goal) //play until cash get zero or cash not reach to goal
			{
				bets++;
				if (Math.random() < 0.5)
				cash++;     
				else
				cash--;     
			}
			if (cash == goal)	//if cash achieve the goal win else loss
				wins++;                
			else
				loss++;
		}
	System.out.println("No of wins"+wins);
	System.out.println("Percent of win = "+100.0*wins/no);
	System.out.println("Percent of loss = "+100.0*loss/no);

}


//2D Array insertion
public int[][] put(int m,int n)
{
int i,j;
int list[][]=new int[m][n];

	for(i=0;i<m;i++)
	{
	System.out.println("Enter"+(i+1)+"st row");
		for(j=0;j<n;j++)
		{
			list[i][j]=sc.nextInt();
		}
	}
return list;

}


//validate the no range
public boolean validateNo(int no)
{
	if(no<31 && no>=0)
	return true;
	else 
	return false;
}


//generate table of 2^n
public void powerTable(int no)
{
	int power=1;
	if(no==0)
	System.out.println("2^0=1");
	else
	{
		System.out.println("2^0=1");
		for(int i=1;i<=no;i++)
		{
			power=power*2;
			System.out.println("2^"+i+"="+power);
		}
	}
}


//String is anagram or not
public boolean isAnagram(String str1,String str2)
{
int i,j,flag=0;
if(str1.length()==str2.length())
	{
		char ctr1[]=str1.toCharArray();
		char ctr2[]=str2.toCharArray();
		System.out.println(str1.length());
		for(i=0;i<str1.length();i++)
		{
			for(j=0;j<str2.length();j++)
			{
				if(ctr1[i]==ctr2[j])
				{
				flag=1;
				break;
				}
				else
				flag=0;
			}
		}
	}
	if(flag==1)
	return true;
	else
	return false;
}


//Find triple that sums to zero
public void findTriple(int list[],int no)
{
int i,j,k,flag=0;
for(i=0;i<no;i++)
{
	for(j=i+1;j<no;j++)
	{
		for(k=j+1;k<no;k++)
		{
			if((list[i]+list[j]+list[k])==0)
			{
			System.out.println("Combination of triples: "+list[i]+" "+list[j]+" "+list[k]+"=0");
			flag=1;
			break;
			}
		}
	}
}
if(flag==0)
	System.out.println("No triple found");
}


//get start time
public long elapsedTime()
{
	long start,finalElapsed;
	//getting start time
	start=System.currentTimeMillis();
	System.out.println("Start time:" +start);
	Utility u=new Utility();

	//call to stopWatch to get stop time
	finalElapsed=u.stopWatch(start); 
	return finalElapsed;
}

//get stop time
public long stopWatch(long start) 
{
	long stop,elapsed;
	String end;

	//enter stop time
	end=sc.next();
	
	//calulate stop time
	stop=System.currentTimeMillis();
	System.out.println("Stop time:" +stop);
	Utility u1=new Utility();

	//calls calculateElapsedTime to calculate time betwwen start & stop
	elapsed=u1.calculateElapsedTime(start,stop);
	return elapsed;
}


//finds the time between start and stop
public long calculateElapsedTime(long start,long stop) 
{
	long calcElapsed;
	//calculate elapsed time	
	calcElapsed=stop-start;
	//converts elapsed time into seconds
	calcElapsed=calcElapsed/1000;
	return calcElapsed;
}


//search no using Binary search
public void binaryNoSearch(int no) 
{
	Random r=new Random();
	String op="";
	int power=1,i;
	//calculate power of u ser input no
	for(i=1;i<=no;i++) 
	{
		power=power*2;
	}
	int first=0,last=power-1,count=0;
	int middle=(first+last)/2;
	//create index of power size
	int list[]=new int[power]; 
	for(i=0;i<=last;i++)
	{
		//random no are inserted in array
		list[i]=r.nextInt(power-1); 
	}
	while(first<=last)
	{
		System.out.println("is your no is?if yes Enter yes..else enter high or low:"+middle);
		count++;
		op=sc.next();
		//if no is low change last
		if(op.equals("low"))	
		{
			last=middle-1;
			count++;
		}
		//if no is high change first
		else if(op.equals("high")) 
		{
			first=middle+1;
			count++;
		}
		//if match found
		else if(op.equals("yes"))	
		{
			System.out.println("Match found");
			break;
		}	
		//wrong input other than high low and yes
		else										
			System.out.println("wrong input");

			middle=(first+last)/2;
	}
	if(count>no)
		System.out.println("Match not found");

		System.out.println("No of attempts to find"+count);
}


//Storing words in array of size no
public String[] addStrings(int no) 
{
	int i;
	String list[]=new String[no];
	System.out.println("Enter word ::");
		//adding strings in array
		for(i=0;i<no;i++)		
			{
			list[i]=sc.next();	
			}
	return list;
}


//to serach a word from list using binary search
public void binaryWordSearch(String list[],String word) 
{
	int i,first=0;
	int count=0;
	int last=list.length-1;
	int middle=(first+last)/2;
	//searching start
	for(i=0;i<=last;i++)
	{
		if((list[middle].compareTo(word))==0)//match found
		{
		count++;
		System.out.println("Match found at "+(middle+1));
		break;
		}
		else if(list[middle].compareTo(word)<0)//middle is less than word to be search
		{
		first=middle+1;
		count++;
		}
		else	//middle is greater than word to be search
		{
		last=middle-1;
		count++;
		}
		middle=(first+last)/2;
	}
	if(first>last)	//word is not found
		System.out.println("Word is not found "+word);

	System.out.println("No of attempts to search"+count);
}


//create integer array of length
public int[] addInt(int no)
{
	int i;
	int list[]=new int[no];
	System.out.println("Enter element one by one:");
	//adding integers in array	
	for(i=0;i<no;i++)
	{
		list[i]=sc.nextInt();
	}
	return list;
}

//bubble sort for integers
public int[] bubbleSort(int list[],int no)
{
	int i,j,temp;
	for(i=0;i<no;i++)
	{
		for(j=0;j<no-i-1;j++)
		{
		//bubble sort logic
			if(list[j]>list[j+1])
			{
			temp=list[j+1];
			list[j+1]=list[j];
			list[j]=temp;
			}
		}
	}
	return list;
}

//bubble sort for String
public String[] bubbleSort(String list[],int no)
{
	int i,j;
	String temp;
	for(i=0;i<no;i++)
	{
		for(j=0;j<no-i-1;j++)
		{
		//bubble sort logic
			if(list[j].compareTo(list[j+1])>0)
			{
			temp=list[j+1];
			list[j+1]=list[j];
			list[j]=temp;
			}
		}
	}
	return list;
}


//insertion sort on String array
public String[] insertionSort(String[] list,int no)
{
	int i,j;
	String key;
	for(i=1;i<no;i++)
	{
	key=list[i];
	for(j=i-1;j>=0 && list[j].compareTo(key)>0;j--)
		{
		list[j+1]=list[j];
		list[j]=key;
		}
		}
return list;
}























}





























