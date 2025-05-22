import java.util.*;
public class Primitive
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Age (integer): ");
int age=sc.nextInt();
System.out.print("Enter Height (float value): ");
float height=sc.nextFloat();
System.out.print("Enter Weight (double value): ");
double weight=sc.nextDouble();
System.out.print("Enter Grade (character): ");
char grade=sc.next().charAt(0);     
System.out.print("Check if Student (true or false): ");
boolean isStud=sc.nextBoolean();
System.out.println("\n--- Displaying Entered Values ---");
System.out.println("Integer (int) value: " + age);
System.out.println("Float (float) value: " + height);
System.out.println("Double (double) value: " + weight);
System.out.println("Character (char) value: " + grade);
System.out.println("Boolean (boolean) value: " + isStud);        
}
}
