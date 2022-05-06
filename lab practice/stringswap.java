import java.util.*;

class str
{
void string()
{
String a;
String b;
Scanner s=new Scanner(System.in);
System.out.println("Enter the First String :");
a=s.next();
System.out.println("Enter the Second String :");
b=s.next();
System.out.println("Strings before swap: a = " +a +" and b = "+b);
a = a + b;
b = a.substring(0,a.length()-b.length());
a = a.substring(b.length());
System.out.println("String after the swap is a : "+a+" and b : "+b);
}
}

class stringswap
{	
public static void main(String args[])
{
str st=new str();
st.string();	
}	
}
