import java.util.*;
class frexample
{

void ta(int y)
{
for (int i=1; i<=10; i++)
{
    System.out.println(i*y);
}
}
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number :");
n=s.nextInt();
frexample a=new frexample();
System.out.println(n+" tables is :");
a.ta(n);
}
}