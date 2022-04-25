import java.util.*;
public class tostringex
{
int rollno;
String name,addr;
tostringex(int rollno,String name,String addr)
{
this.rollno=rollno;
this.name=name;
this.addr=addr;
}
public String tostring()
{
return rollno+" "+name+" "+addr;
}

public static void main(String args[])
{
tostringex s=new tostringex(1,"ram","mumbai");
tostringex s1=new tostringex(2,"karan","jaipur");
System.out.println(s.tostring());
System.out.println(s1.tostring());
}
}