public class overloadex
{
static int pulseme(int x,int y)
{
return x+y;
}
static int pulseme(int x,int y,int z)
{
return x+y+z;
}
static double pulseme(double x,double y)
{
return x+y;
}
public static void main(String args[])
{
int a=pulseme(38,78);
int c=pulseme(123,67,89);
double b=pulseme(88.9,3.43);
System.out.println("int 2 argument :"+a);
System.out.println("int 3 argument : "+c);
System.out.println("int 1 argument : "+b);
}
}