public class threadjoinex extends Thread
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
}

public static void main(String args[])
{
threadjoinex t=new threadjoinex();
threadjoinex t1 =new threadjoinex();
threadjoinex t2=new threadjoinex();
t.start();
try 
{
t1.join();
}
catch(InterruptedException e)
{
System.out.println(e);
}
t1.start();
t2.start();
}
}
