package Day5;
import java.util.Scanner;
public class Distance
{
	public static void main(String arg[])
	
	{
		int x1,x2,y1,y2;
	    double dis;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter x1 point");
	    x1=sc.nextInt();
	    System.out.println("enter y1 point");
	    y1=sc.nextInt();
	    System.out.println("enter x2point");
	    x2=sc.nextInt();
 	    System.out.println("enter y2 point");
	    y2=sc.nextInt();
	  	    
		dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	System.out.println("Distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")="+dis);
 
	}
 
}