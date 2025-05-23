import java.util.*;
public class Grade
{
 public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int marks;
System.out.println("Enter Marks out of 100 : ");
marks=sc.nextInt();
if(marks>100)
{
System.out.println("Please Enter Correct Marks");
System.exit(0);
}
if(marks>=90)
{
System.out.println("GRADE : A");
}
else if(marks>=80 && marks<90)
{ 
System.out.println("GRADE : B");
}
else if(marks>=70 && marks<80)
{
System.out.println("GRADE : C");
}
else if(marks>=60 && marks<70)
{
System.out.println("GRADE : D");
}
else
{
System.out.println("GRADE : F");
}
}
}