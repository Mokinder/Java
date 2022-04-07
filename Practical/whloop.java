import java.util.*;
class whloop
{
int wh(int n)
{
int i=0,sm=0;
while(i<=n)
{
sm=i+sm;
i++;
}
return sm;
}
public static void main(String args[])
{
int sum,x;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number :");
x=s.nextInt();
whloop w=new whloop();
sum=w.wh(x);
System.out.println("Sum of numbers till "+x+" is :"+sum);
}
}