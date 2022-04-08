class brkconex
{
void brk()
{
for(int i=1;i<=10;i++)
{
if(i==6)
{
break;
}
System.out.println(i);
}
}
void con()
{
for(int i=1;i<=10;i++)
{
if(i==6)
{
continue;
}
System.out.println(i);
}
}
public static void main(String args[])
{
 brkconex n = new brkconex();
System.out.println("Output for Break");
 n.brk();
System.out.println("Output for continue");
 n.con();
}
}