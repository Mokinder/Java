abstract class bankk
{
abstract int getrateofinterest();
}
class axis extends bankk
{
int getrateofinterest()
{
return 7;
}
}
class icici extends bankk
{
int getrateofinterest()
{
  return 6;
}
}

class abstractex
{
public static void main(String args[])
{
int x,y;
axis a=new axis();
icici i=new icici();
x=a.getrateofinterest();
System.out.println("The rate of interest in Axis Bank is "+x);
System.out.println("The rate of interest in ICICI Bank is "+i.getrateofinterest());
}
}

