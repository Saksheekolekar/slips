package slips;
import java.util.*;


public class slip6a
{ 
	public String toString() 
	 {
	
		return "employee id:\t"+id+"\nemployee name:\t"+nm+"\nemployee designation:\t"+des+"\nemployee salary:\t"+sal;
	}
	 static int id;
	 static String nm,des,sal;
public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Emp id");
 id=sc.nextInt();
 System.out.println("Enter Emp name");
  nm=sc.next();
 System.out.println("Enter Emp designation");
  des=sc.next();
 System.out.println("Enter Emp salary");
  sal=sc.next();
   slip6a d =new slip6a();
   System.out.println(""+d);
}
}
