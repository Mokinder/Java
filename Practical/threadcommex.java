class data 
{
int i;
boolean valueset=false;
synchronized void produce(int i)
{
if(valueset)
{
try
{
wait();
}
catch(Exception e)
{
System.out.println(e);
}
}
this.i=i;
valueset=true;
System.out.println("Data production done "+i);
notify();
}

synchronized int consume()
{
if(!valueset)
{
try{
wait();
}
catch(Exception e)
{
System.out.println(e);
}
}
System.out.println("Data Consumed "+i);
valueset=false;
notify();
return i;
}
}

class producer extends Thread
{
data d;
public producer(data d)
{
this.d=d;
}
public void run()
{
for(int j=1;j<=5;j++)
{
d.produce(j);
}
}
}

class consumer extends Thread
{
data d;
public consumer(data d)
{
this.d=d;
}
public void run()
{
for(int k=1;k<=5;k++)
{
d.consume();
}
}
}
public class threadcommex
{
public static void main(String args[])
{
data d=new data();
producer p=new producer(d);
consumer c=new consumer(d);
p.start();
c.start();
}
}