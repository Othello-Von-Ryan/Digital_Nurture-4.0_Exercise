import java.util.*;
public class Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
double a, b, result = 0.0;
System.out.println("Enter First Number: ");
a=sc.nextDouble();
System.out.println("Enter Second Number: ");
b=sc.nextDouble();
System.out.println("Choose Operation:");
System.out.println("Press 1 for Addition");
System.out.println("Press 2 for Subtraction");
System.out.println("Press 3 for Multiplication");
System.out.println("Press 4 for Division");
i=sc.nextInt();
switch(i)
{
case 1: result=a+b;
        System.out.println("The Sum is : "+result);
break;
case 2: result=a-b;
        System.out.println("The Difference is : "+result);
break;
case 3: result=a*b;
        System.out.println("The Product is : "+result);
break;
case 4: if(b!=0)
{      
 result=a/b;
 System.out.println("The Quotient is : "+result);
}
else
{
 System.out.println("Error: Division by zero is not allowed");
}
break;
default: System.out.println("Wrong Choise");
}
sc.close();
}
}
