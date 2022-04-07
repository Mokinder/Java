import java.util.*;
class swtcase
{
void scs()
{
  String x;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Name");
x=s.next();
switch(x)
{
case "aaa":System.out.println("Pass");break;
case "bbb":System.out.println("Pass");break;
case "ccc":System.out.println("Fail");break;
case "ddd":System.out.println("Pass");break;
default: System.out.println("Enter the name properly..pls..");
}
}
public static void main(String args[])
{
 swtcase a=new swtcase();
a.scs();
}
}
