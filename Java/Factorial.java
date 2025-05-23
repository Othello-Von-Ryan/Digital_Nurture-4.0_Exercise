import java.util.*;
class Factorial
{
public static void main(String args[])
{
int num,i,fact=1;;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number : ");
num=sc.nextInt();
if(num<0)
{
System.out.println("Factorial is not defined for Negative Numbers");
}
else
{
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial = "+fact);
}
}
}