import java.util.*;
public class nonstaticlocalnestclassex
{
int a=35;
private int b=45;
void display()
{
class inner
{
 int res;
void show()
{
System.out.println("Value of res : "+(a+b));
}
}
inner i=new inner();
i.show();
}

public static void main(String args[])
{
nonstaticlocalnestclassex nl=new nonstaticlocalnestclassex();
nl.display();
}
}