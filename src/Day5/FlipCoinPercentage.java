package Day5;
public class FlipCoinPercentage{
 static int count=10;
 static int headcount=0;
 static int tailscount=0;
 static double flipcoin;
 static int headcountpercentage;
 static int tailscountpercentage;
 public static void flipCoin() { 
	 for(int i=1;i<=5;i++) {
		 flipcoin=Math.floor(Math.random()*10)%2;
		 if(flipcoin==0) {
			 System.out.println("Heads");
			 headcount+=1;
			 headcountpercentage=(headcount*100)/10;
		}else {
			System.out.println("Tails");
			tailscount+=1;
			tailscountpercentage=(tailscount*100)/10;
		}
	 }
	 System.out.println("Total number of heads"+headcount);
	 System.out.println("Total number of tails"+tailscount);
	 System.out.println("Total number of heads percentage"+headcountpercentage);
	 System.out.println("Total number of tails percentage"+tailscountpercentage);
}
public static void main(String[] args) {
	flipCoin();
}
}

