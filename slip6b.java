package slips;
import java.util.*;
abstract class order
{   
	Scanner sc=  new Scanner(System.in);
	int id;
	String des;
	 abstract  void  accept( );
	abstract void display();
}
class porder extends order
{ 
	String cname;
	void accept()
	{
		System.out.println("enter purchase order id:");	
		id=sc.nextInt();
		System.out.println("enter description:");	
		des=sc.next();
		System.out.println("enter customer name:");	
		cname=sc.next();	
	}

	
	void display()
	{
		System.out.println(" order id:"+id);	
		System.out.println("description:"+des);
		System.out.println("customer name:"+cname);	
	}

}
class sorder extends order
{ 
	String vname;
	void accept()
	{
		System.out.println("enter  sales order id:");	
		id=sc.nextInt();
		System.out.println("enter   description:");	
		des=sc.next();
		System.out.println("enter  svendor name:");	
		vname=sc.next();	
	}
	void display()
	{
		System.out.println("  order id:"+id);	
		System.out.println("description:"+des);
		System.out.println("vendor name:"+vname);	
	}

}
public class slip6b 
{
public static void main(String[] args) 
{
	porder p1=new porder();
	porder p2=new porder();
	porder p3=new porder();
	p1.accept();
	p2.accept();
	p3.accept();
	sorder s1=new sorder();
	sorder s2=new sorder();
	sorder s3=new sorder();
	s1.accept();s2.accept();s3.accept();
	p1.display();p2.display();p3.display();
	s1.display();s2.display();s3.display();
}
}
