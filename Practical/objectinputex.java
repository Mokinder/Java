import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class student implements Serializable
{
int id;
String sname;
transient int fees;

public student(int id,String sname,int fees)
{
this.id=id;
this.sname=sname;
this.fees=fees;
}
}

public class objectinputex
{
public static void main(String args[])
{
try
{
ObjectInputStream oi = new ObjectInputStream(new FileInputStream("C:\\Users\\mokin\\Documents\\saa.txt"));
student s=(student)oi.readObject();
System.out.println("id is : "+s.id+" name is "+s.sname);
oi.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}