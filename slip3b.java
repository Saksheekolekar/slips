package slips;
import java.util.*;
class ex extends Exception
{  
 public String toString()
	{
		return "Patient is CovidPositive(+) and Need to Hospitalized";
	}
}
class patient
{
 patient() 
{ 
	Scanner sc=new Scanner(System.in);
	try
	{
		System.out.print("enter the name of patient: ");
		String nm=sc.next();
		System.out.print("enter the age of patient: ");
		int ag=sc.nextInt();
		System.out.print("enter the oxy level of patient: ");
		int o=sc.nextInt();
		System.out.print("enter the hrct report of patient: ");
		int h=sc.nextInt();
		if(o<95&&h>10)
			throw new ex();
		System.out.print("name and age and oxylevel and hrct is "+nm+ag+o+h);
		
	}
	catch( Exception e)
	{
		System.out.print("exception is: "+e);
	}

}	
}

public class slip3b
{
public static void main(String[] args)
{
	patient pe=new patient();
	
}
}
