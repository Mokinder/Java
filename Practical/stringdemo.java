import java.util.*;
public class stringdemo
{
public void show()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the String : ");
String a=s.next();
String b=s.next();
System.out.println(a.length()+b.length());
System.out.println(a.compareTo(b)>0?"Yes":"No");
System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));

}

public static void main(String args[])
{
stringdemo d=new stringdemo();
d.show();
}
}