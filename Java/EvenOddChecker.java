import java.util.*;
public class EvenOddChecker
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter an Integer : ");
num=sc.nextInt();
if(num%2==0)
System.out.println("Even Number");
else 
System.out.println("Odd Number");
}
}
