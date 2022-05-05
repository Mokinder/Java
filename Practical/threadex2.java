public class threadex2 extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
try
{
Thread.sleep(800);
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);
}
System.out.println(Thread.currentThread().getName());
//System.out.println(Thread.currentThread().getPriority());
}
public static void main(String args[])
{
threadex2 t=new threadex2();
threadex2 t1=new threadex2();
threadex2 t2=new threadex2();
//System.out.println(MAX PRIORITY);
t.start();
t1.start();
t2.start();

t1.setName("Thread mamta");
}
}