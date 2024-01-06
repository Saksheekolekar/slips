package slips;
import java.util.*;
abstract class  staff
{
protected	int id;
protected String name;
public staff(int id,String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println("staff id:"+id);	
System.out.println("staff name:"+name);
}
}
class officestaff extends staff
{
	String dept;
	public officestaff(int id, String name,String dept) 
	{
		super(id, name);
		this.dept=dept;	
	}
	
	void display()
	{
	super.display();
	System.out.println("dept:"+dept);
	}
}
public class slip1b 
{
	
public static void main(String[] args)
 {  
	Scanner sc = new Scanner(System.in);
	System.out.println("enter th limit");
	int n=sc.nextInt();
	officestaff ob[]=new officestaff[n];
	for( int i=0;i<n;i++)
	{
		System.out.println("enter th staff id");
		int idd=sc.nextInt();
		System.out.println("enter th staff name");
		String nm=sc.next();
		System.out.println("enter th department");
		String d=sc.next();
		ob[i]= new officestaff(idd, nm, d);
	}
	for( int i=0;i<n;i++)
	{
		ob[i].display();
	}
}
}
