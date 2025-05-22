import java.util.*;
public class TypeCastEg
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a decimal number: ");
double a=sc.nextDouble();  
int b=(int) a;
System.out.println("Original double value: "+a);
System.out.println("After casting to int: "+b);
System.out.print("Enter an Integer: ");
int c=sc.nextInt();     
double d=c;
System.out.println("Original int value: "+c);
System.out.println("After casting to double: "+d);
}
}
