import java.util.*;
public class OpPrece 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number : ");
int a=sc.nextInt();
System.out.print("Enter second number : ");
int b=sc.nextInt();
System.out.print("Enter third number : ");
int c=sc.nextInt();
int res1=a+b*c;
System.out.println("\nExpression 1: " +a+ " + " + b + " * " + c + " = " + res1);
System.out.println("Explanation: Multiplication has higher precedence than addition\n");
int res2 = (a + b) * c;
System.out.println("Expression 2: (" + a + " + " + b + ") * " + c + " = " + res2);
System.out.println("Explanation: Parentheses are evaluated first\n");
int res3 = a + b - c;
System.out.println("Expression 3: " + a + " + " + b + " - " + c + " = " + res3);
System.out.println("Explanation: Addition and subtraction are evaluated left to right\n");
}
}

        
