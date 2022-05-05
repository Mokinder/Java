import java.util.*;
class threadex1 implements Runnable
{
public void run()
{
System.out.println("I am thread Thread is running...");
}
public static void main(String args[])
{
threadex1 t=new threadex1();
Thread th=new Thread(t);
th.start();
}
}