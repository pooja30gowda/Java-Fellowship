package Day6;
import java.util.*;
 
public class TemperatureConverstion
{
 public static void main(String args[])
 {
 float celsius,fahrenheit;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter temperature in Fahrenheit :");
 fahrenheit=sc.nextInt();
 celsius=(fahrenheit - 32)*5/9;
 Scanner sc2 = new Scanner(System.in);
 System.out.println("fahrenheit to Celsius = "+celsius);
 System.out.println("Enter temperature in celsius :");
 celsius=sc2.nextInt();
 fahrenheit=(celsius*5/9)- 32;
 System.out.println("Celsius to fahrenheit = "+fahrenheit);
 }
}