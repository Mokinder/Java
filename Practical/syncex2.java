class sample
{
synchronized static void print(int num)  // sync static method
{
for(int i=1;i<=5;i++)
{
System.out.println(num*i);
try{
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
public void run()
{
sample.print(3);
}
}

class Thread2 extends Thread
{
public void run()
{
sample.print(5);
}
}

public class syncex2
{
public static void main(String args[])
{
sample s=new sample();
Thread1 t=new Thread1();
Thread2 t1=new Thread2();
t.start();
t1.start();
}
}