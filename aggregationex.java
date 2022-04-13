class address
{
String street,city,state,country;
int pincode;

public address(String street,String city,String state,String country,int pincode)
{
this.street=street;
this.city=city;
this.state=state;
this.country=country;
this.pincode=pincode;
}
}

class student
{
int studentid;
String studentname,coursename,centrename;
address addr;

public student(int studentid,String studentname,String coursename,String centrename,address addr)
{
this.studentid=studentid;
this.studentname=studentname;
this.coursename=coursename;
this.centrename=centrename;
this.addr=addr;
}
public void display()
{
System.out.println("ID is "+studentid+" "+",Name is "+studentname+" "+",CourseName is "+coursename+" "+",Centre  Name is "+centrename);
System.out.println(addr.street+" "+addr.city+" "+addr.state+" "+addr.country+" "+addr.pincode);
}
}
class aggregationex
{
public static void main(String args[])
{
address a=new address("XYZ Street","mumbai","MH","India",4000705);
address a1=new address("ABC ROAD","Chennai","TN","India",344444);
student s=new student(101,"mamta","java","chennai",a);
student s1=new student(102,"Ram",".net","kolkata",a1);
s.display();
s1.display();
}
}