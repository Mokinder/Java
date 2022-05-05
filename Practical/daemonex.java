public class daemonex extends Thread
{
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println(Thread.currentThread().getName());
System.out.println("I am Daemon");
}
else
{
System.out.println("I am user");
}
}
public static void main(String args[])
{
daemonex d=new daemonex();
daemonex d1=new daemonex();
daemonex d2=new daemonex();

d1.setDaemon(true);
d.start();
d1.start();
d2.start();
}
}