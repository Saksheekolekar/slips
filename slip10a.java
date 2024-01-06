package slips;
import java.util.*;
interface cube
{
abstract void cube( int c);	
}
public class slip10a implements cube 
{
	public void cube( int c) 
	{
		System.out.print("cube of given number is="+(c*c*c));	
			
	}
public static void main(String[] args)
{ 
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number");
	 int n=sc.nextInt();
	slip10a s=new slip10a();
	s.cube(n);
	 
}
	
}
