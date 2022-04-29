import java.util.*;
class asc
{
void printasc()
{
Scanner s=new Scanner(System.in);
char c;  
System.out.println("Enter the character :");
c=s.next(). charAt(0);   
int as = (int) c;  
System.out.println("The ASCII value of " + c + " is: " + as);  
}
}
class ascii
{
public static void main(String args[])
{
asc a=new asc();
a.printasc();
}
}


