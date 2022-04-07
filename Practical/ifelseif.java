import java.util.*;
class ifelseif
{
void tm(int t)
{
if (t<12)
{
System.out.println("Hii..It's...Morning Time");
}
else if (t<17)
{
System.out.println("It's....Afternoon Time");
}
else if(t<21)
{
System.out.println("It's..Evening Time");
}
else
{
System.out.println("Its..Night");
}
}
public static void main(String args[])
{
int a;
Scanner s= new Scanner(System.in);
System.out.println("Enter the Time :");
a=s.nextInt();
ifelseif l=new ifelseif();
l.tm(a);
}
}