import java.util.*;
class assignmt1
{
void mrks(int m,String y)
{

 if ((m>=35)&&(m<45))
{
System.out.println("Hii.."+y+",Your Grade is D");
}
else if ((m>=45)&&(m<60))
{
System.out.println("Hii.."+y+",Your Grade is C.");
}
else if((m>=60)&&(m<75))
{
System.out.println("Hii.."+y+",Your Grade is B.");
}
else if((m>=75)&&(m<85))
{
System.out.println("Hii.."+y+",Your Grade is A.");
}
else if((m>=85)&&(m<100))
{
System.out.println("Hii.."+y+",Your Grade is O.");
}
else
{
System.out.println("Sorry.."+y+",You are Fail/Absent.");
}
}

public static void main(String args[])
{
int mr;
String sr;
Scanner s=new Scanner(System.in);
assignmt1 am=new assignmt1();
System.out.println("Enter your name :");
sr=s.next();
System.out.println("Enter your Mark :");
mr=s.nextInt();
if((mr>=0)&&(mr<=100))
{
am.mrks(mr,sr);
}
else
{
System.out.println("Pls...enter the mark properly..");
}
}
}