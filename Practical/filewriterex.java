import java.io.FileWriter;

public class filewriterex
{
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter("C:\\Users\\mokin\\Documents\\saa.txt");
fw.write("Welcome to anudip foundation skill development center");

fw.close();
System.out.println("Done");
}
catch(Exception e)
{
System.out.println(e);
}
}
}