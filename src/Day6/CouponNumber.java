package Day6;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	static int couponnum;
	public static void main(String[] args) {
		System.out.println("Enter the N distinct coupon numbers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		sc.close();
		int[] newcouponnum=new int[n];
		for(i=0;i<n;i++)
		{
			newcouponnum[i]=RandomNumbers();
			System.out.println(newcouponnum[i]);
		}
		for(int j=0;j<=newcouponnum.length;j++)
		{
			for(int k=0;k<=newcouponnum.length;k++)
			{
				if(newcouponnum[j]==newcouponnum[k]){
					newcouponnum[k]=RandomNumbers();
					System.out.println("newcouponnum"+newcouponnum[k]);
				}
			}
		}
		System.out.println("total random number needed to have all distinct numbers"+n);
		
	}
	public static int RandomNumbers()
	{
		Random r=new Random();
		couponnum=r.nextInt(99999-10000+1)*10000;
		return(couponnum);
	}
}
