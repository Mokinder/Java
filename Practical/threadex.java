import java.util.*;

public class threadex extends Thread
{
public void run()
{
System.out.println("I am Thread Thread is running..");
}
public static void main(String args[])
{
threadex t=new threadex();
t.start();
String s=t.getName();
System.out.println(s);
}
}