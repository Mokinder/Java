import java.util.*;

class logicoperators
{
int age;
void agevalid()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your Age : ");
age=s.nextInt();
if(age!=0)
{
 if(age<18 || age>=45)
{
System.out.println("Sorry,you are not eligible");
}
else if(age >=18 && age<=45)
{
System.out.println(" Your are eligeble for loan");
}
else
{
System.out.println("Enter properly..");
}
}
else
{
System.out.println("Age can't be 0.");
}
}
}
class logicalop
{
public static void main(String args[])
{
logicoperators lp=new logicoperators();
lp.agevalid();
}
}