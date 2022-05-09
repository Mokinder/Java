import java.io.FileReader;

public class filereaderex
{
public static void main(String args[])
{
try
{
FileReader fr=new FileReader("C:\\Users\\mokin\\Documents\\saa.txt");
int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
System.out.println("Done");
}
catch(Exception e)
{
System.out.println(e);
}
}
}