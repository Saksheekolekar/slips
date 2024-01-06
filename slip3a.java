package slips;
import java.util.*;
public class slip3a 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the limit");
	int n=sc.nextInt();
	String[] c2 = new String[n];
	for(int i=0;i<n;i++)
	{ 	
		System.out.println("enter the name of city");
		c2[i]=sc.next();
	}
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(c2[i].compareTo(c2[j])>0)
				{
					String c=c2[i];
					c2[i]=c2[j];
					c2[j]=c;
				}
			}
				
		}
		System.out.println("sorted city names are:");
		for(int i=(n-1);i>=0;i--)	
		{
			System.out.println(""+c2[i]);	
		}
	
}
}
