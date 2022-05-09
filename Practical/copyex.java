import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyex
{
public static void main(String args[])
{
try
{
FileInputStream fin =new FileInputStream("C:\\Users\\mokin\\Documents\\saa.txt");
FileOutputStream fout=new FileOutputStream("C:\\Users\\mokin\\Documents\\test1.txt");
byte ar[]=new byte[1024];
int i;
while((i=fin.read())>0)
{
fout.write(ar);
}
fin.close();
fout.close();
System.out.println(" Done ");
}
catch(Exception e)
{
System.out.println(e);
}
}
}