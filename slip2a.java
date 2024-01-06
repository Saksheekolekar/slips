package slips;

public class slip2a
{
public static void main(String[] args) 
{  
	
	String fname=args[0];
	String lastname=args[1];
	double wt=Double.parseDouble(args[2]);
	double h=Double.parseDouble(args[3]);
	double bmi=wt/(h*h);
	System.out.println("first name: "+fname);
	System.out.println("last name: "+lastname);
	System.out.println("weight: "+wt);
	System.out.println("height: "+h);
	System.out.println("bmi index : "+bmi);
	 
}
}
