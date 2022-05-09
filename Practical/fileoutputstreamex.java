import java.io.FileOutputStream;

public class fileoutputstreamex
{
public static void main(String args[])
{
try
{
FileOutputStream f =new FileOutputStream("C:\\Users\\mokin\\Documents\\test1.txt");
String s="Welcome Mokinder";
byte b[]=s.getBytes();
f.write(b);
f.close();
System.out.println("Done");
}
catch(Exception e)
{
System.out.println(e);
}
}
}