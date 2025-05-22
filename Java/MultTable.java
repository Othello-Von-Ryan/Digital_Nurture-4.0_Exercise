import java.util.*;
public class MultTable
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,i;
System.out.println("Enter a Number : ");
num=sc.nextInt();
System.out.println("Multiplication Table of "+num+" is : ");
for(i=1;i<=10;i++)
{
int res=num*i;
System.out.println(num+" x "+i+" = "+res);
}
}
}