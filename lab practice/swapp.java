import java.util.*;
class swapping
{
void withvariable(int a,int b)
{
int c;
System.out.println("This is Swapping of two numbers with Third variable. ");
c=a;
a=b;
b=c;
System.out.println("The value of  a is "+a+" and b is "+b);
}
void withoutvariable(int a,int b)
{
a=a+b;
b=a-b;
a=a-b;
System.out.println("This is Swapping of two numbers with Third variable. ");
System.out.println("The value of  a is "+a+" and b is "+b);
}
}
class swapp
{
public static void main(String args[])
{
int x,y;
Scanner s= new Scanner(System.in);
System.out.println("Enter the first number : ");
x=s.nextInt();
System.out.println("Enter the Second number : ");
y=s.nextInt();
System.out.println("The value of  a is "+x+" and b is "+y+" before Swap");
swapping sw = new swapping();
sw.withvariable(x,y);
sw.withoutvariable(x,y);
}
}