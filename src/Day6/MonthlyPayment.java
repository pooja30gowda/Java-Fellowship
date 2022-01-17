package Day6;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Loan");
		int P=sc.nextInt();
		System.out.println("Enter the year to payoff");
		int Y=sc.nextInt();
		System.out.println("Enter rate per interest");
		double R=sc.nextInt();
		sc.close();
		
		int n=12*Y;
		double r=R/(12*100);
		System.out.println("n"+n);
		System.out.println("r"+r);
		double payment=(P*r)/(1-Math.pow(1+r,-n));
		System.out.println("Montly payment"+payment);
		System.out.println(Math.pow(1+r,-n));
		

	}

}
