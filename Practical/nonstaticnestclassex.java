import java.util.*;
public class nonstaticnestclassex
{
int a=35;
private int b=45;
class inner
{
 int res;
void show()
{
System.out.println("Value of res : "+(a+b));
}
}
public static void main(String args[])
{
nonstaticnestclassex ns=new nonstaticnestclassex();
nonstaticnestclassex.inner i=ns.new inner();
i.show();
}
}