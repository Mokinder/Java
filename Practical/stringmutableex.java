import java.util.*;
public class stringmutableex
{
public static void my()
{

StringBuffer s=new StringBuffer("Hello");
s.append(" world");
System.out.println("String Append is "+s);
s.insert(4,"mamta");
System.out.println("String insert is "+s);
StringBuilder s1 = new StringBuilder("world");
s1.replace(1,3,"java");
System.out.println("String replace is :"+s1);
s1.delete(1,3);
System.out.println("String delete is "+s1);
s1.reverse();
System.out.println("String reverse is "+s1);

}
public static void main(String args[])
{
my();
}
}