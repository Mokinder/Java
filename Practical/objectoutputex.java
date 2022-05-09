import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

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

public class objectoutputex
{
public static void main(String args[])
{
try
{
student s=new student(101,"iuf",2000);
FileOutputStream fout=new FileOutputStream("C:\\Users\\mokin\\Documents\\saa.txt");
ObjectOutputStream obj = new ObjectOutputStream(fout);
obj.writeObject(s);
obj.close();
System.out.println("Done");
}
catch(Exception e)
{
System.out.println(e);
}
}
}