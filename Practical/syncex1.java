class sample
{
synchronized void print(int num)      //sync method
{
for(int i=1;i<=5;i++)
{
System.out.println(num*i);
try
{
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class Thread1 extends Thread
{
sample t;
public Thread1(sample t)
{
this.t=t;
}
public void run()
{
t.print(3);
}
}

class Thread2 extends Thread
{
sample t;
public Thread2(sample t)
{
this.t=t;
}
public void run()
{
t.print(5);
}
}

public class syncex1
{
public static void main(String args[])
{
sample s=new sample();
Thread1 t=new Thread1(s);
Thread2 t1=new Thread2(s);
t.start();
t1.start();
}
}