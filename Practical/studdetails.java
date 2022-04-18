import java.util.*;
class student
{
  private String studname;
  private int studus_id;
  private String passwrd;

  
public void name(String nme)
{
    studname=nme;
}
public void user_id(int us)
{
	studus_id=us;
}
public void password(String p)
{
	passwrd=p;
}

float per(int x1,int x2,int x3,int x4,int x5)
{
float r,s;
s=x1+x2+x3+x4+x5;
r=(s/500)*100;
return r;
}

void grad(float m)
{
if ((m>=35)&&(m<45))
{
System.out.println("Your Grade is D");
}
else if ((m>=45)&&(m<60))
{
System.out.println("Your Grade is C.");
}
else if((m>=60)&&(m<75))
{
System.out.println("Your Grade is B.");
}
else if((m>=75)&&(m<85))
{
System.out.println("Your Grade is A.");
}
else if((m>=85)&&(m<100))
{
System.out.println("Your Grade is O.");
}
else
{
System.out.println("You are Fail/Absent.");
}
}
}


class studdetails
{
public static void main(String args[])
{
String name,password,userid;
int m1,m2,m3,m4,m5;
float result;
Scanner s= new Scanner(System.in);
System.out.println("Enter your Name : ");
name=s.next();
System.out.println("Enter your User ID : ");
userid=s.next();
System.out.println("Enter your Password : ");
password=s.next();
System.out.println("Enter your subject1 mark : ");
m1=s.nextInt();
System.out.println("Enter your subject2 mark : ");
m2=s.nextInt();
System.out.println("Enter your subject3 mark : ");
m3=s.nextInt();
System.out.println("Enter your subject4 mark : ");
m4=s.nextInt();
System.out.println("Enter your subject5 mark : ");
m5=s.nextInt();
student std=new student();
result=std.per(m1,m2,m3,m4,m5);
System.out.println("Your Percentage is : "+result);
std.grad(result);
}
}