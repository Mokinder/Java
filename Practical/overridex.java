class bank
{
int getrateofint()
{
return 0;
}
}
class sbi extends bank
{
int getrateofint()
{
return 8;
}
}
class icici extends bank
{
int getrateint()
{
return 7;
}
}
class axis extends bank
{
int getrateofint()
{
return 6;
}
}
class overridex
{
public static void main(String args[])
{
sbi s=new sbi();
icici i=new icici();
axis a=new axis();
System.out.println("SBI rate of interest is : "+s.getrateofint());
System.out.println("ICICI rate of interest is : "+i.getrateofint());
System.out.println("Axis rate of interest is : "+a.getrateofint());
}
}