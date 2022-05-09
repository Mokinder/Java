import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytearrayoutputstreamex
{
public static void main(String args[]) throws IOException
{
FileOutputStream f1=new FileOutputStream("C:\\Users\\mokin\\Documents\\test1.txt");
FileOutputStream f2=new FileOutputStream("C:\\Users\\mokin\\Documents\\saa.txt");
ByteArrayOutputStream bout =new ByteArrayOutputStream();
bout.write(65);
bout.writeTo(f1);
bout.writeTo(f2);
bout.flush();
bout.close();
System.out.println(" Done ");
}
}