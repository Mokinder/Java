import java.util.*;
class methodex
{

void evnod(int num)
{
if(num%2==0)
{
System.out.println("It is even number");
}
else
{
System.out.println("It is odd number");
}
}

static int add(int n1,int n2)
{
int result=n1+n2;
return result;
}

public static void main(String args[])
{
int n1=40;
int n2=9;
int n;
int result;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number :");
n=s.nextInt();
methodex m=new methodex();
m.evnod(n);
result=m.add(n1,n2);
System.out.println("The addition of " +n1+" and "+n2+" numbers is : "+result);
}
}