import java.util.*;
class ifelse
{
void ag(int a)
{
  if(a>=18)
{
System.out.println("You are Major....");
}
else
{
System.out.println("You are Minor...");
}
}
public static void main(String args[])
{
int x;
Scanner s= new Scanner(System.in);
System.out.println("Enter your Age :");
x=s.nextInt();
ifelse b=new ifelse();
b.ag(x);
}
}