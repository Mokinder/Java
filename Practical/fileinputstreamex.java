import java.io.FileInputStream;

public class fileinputstreamex
{
public static void main(String args[])
{
try
{
FileInputStream f =new FileInputStream("C:\\Users\\mokin\\Documents\\test1.txt");
int i=0;
while((i=f.read())!=-1)
{
System.out.println((char)i);
}
f.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}