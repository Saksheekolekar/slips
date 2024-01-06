package slips;
import java.util.*;

public class slip4a 
{

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number of rows");
	int r=sc.nextInt();
	System.out.print("enter number of columns");
	int c=sc.nextInt();
	int a[][]=new int[r][c];
	System.out.println("enter matrix");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
		  a[i][j]=sc.nextInt();
		}	
	}
	System.out.println("transpose of  matrix:");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(" "+a[j][i]);
		}
		System.out.print(" \n");
	}
}
}
