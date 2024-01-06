package slips;

import java.util.*;
import java.text.*;

public class slip13b 
{
public static void main(String[] args)
{
	Date d=new Date();
	SimpleDateFormat ob=new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("current date: "+ob.format(d));

	 ob=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("current date: "+ob.format(d));
	
		 ob=new SimpleDateFormat("EEEEEE MMMM dd yyyy");
			System.out.println("current date: "+ob.format(d));
	
	 ob=new SimpleDateFormat("EE MMMM dd HH:mm:ss  z yyyy");
		System.out.println("current date: "+ob.format(d));

		 ob=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a Z");
			System.out.println("current date: "+ob.format(d));
			
	
}
}
