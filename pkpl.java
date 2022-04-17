package poovarasan;
import java.util.*;
public class pkpl

		{
		    public static void main(String args[])
		        {
		        	System.out.println("ENTER THE SEAT NUMBER VALUE :");
			        Scanner seat=new Scanner (System.in);
			        int seat_no= seat.nextInt();
			        {
			        	int s=seat_no%8;
			        	if(s==1 || s==4)
			        	{
			        		System.out.println("Lower Birth");
			        	}
			        	
			        	else if (s==2 || s==5)
			        	{
			        		System.out.println("Middel Birth");
			        	}
			        	else if (s== 3|| s==6)
			        	{
			        		System.out.println("Upper Birth");
			        	}
			        	else if (s==7)
			        	{
			        		System.out.println("Side Lower Birth");
			        	}
			        	else
			        	{
			        		System.out.println("Side Upper birth");
			        		
			        	}
			        }
		        }
		}