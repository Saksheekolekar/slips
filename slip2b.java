package slips;
import java.util.*;
class CricketPlayer
{
String name;
int no_of_innings,no_of_times_notout, totatruns, bat_avg;
Scanner sc=new Scanner(System.in);
void caccept()
{
System.out.println ("enter the name of player :");	
name=sc.next();
System.out.println ("enter the no of inning :");	
no_of_innings=sc.nextInt();
System.out.println ("enter the no of times not out:");	
no_of_times_notout=sc.nextInt();
System.out.println ("enter the name of  total runs :");	
totatruns=sc.nextInt();
bat_avg=totatruns/no_of_times_notout;
}
  static void sort(CricketPlayer ob[],int n)
{
	 
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<i;j++)
		  {
			if(ob[i].bat_avg<ob[j].bat_avg)  
			{
				CricketPlayer t=ob[i];
				ob[i]=ob[j];
				ob[j]= t;
			}
		  }
	  }
	  for(int i=0;i<n;i++)
	  {
		  System.out.println ("name"+ob[i].name+ "\t no of innings"+ob[i].no_of_innings+"\tno of nout"+ob[i].no_of_times_notout+"\ttotal runs"+ob[i].totatruns+"\tbat average"+ob[i].bat_avg);	 
	  }
}
}
public class slip2b 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println ("enter limit:");
	 int n=sc.nextInt();
	CricketPlayer ob[]=new CricketPlayer[n];
	for(int i=0;i<n;i++)
	{
	ob[i]=new CricketPlayer();
	ob[i].caccept();
	}
	CricketPlayer.sort(ob,n);
}
}
