package slips;

public class slip1a 
{
public static void main(String[] args)
{
	for(int i=0;i<args.length;i++)
	{
		int n=Integer.parseInt(args[i]);
		 int f=0;
		for(int j=2;j<n;j++)
		 {
			if(n%j==0)  
			{
				f=1;
				break;
			}
		 }
		if(f==0)
			{
			System.out.println("prime number is:"+n);
			}
	}
}
}
