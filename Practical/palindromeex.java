import java.util.*;
class palindromeex
{
void pal()
{
String sr,rv;
Scanner s=new Scanner(System.in);
System.out.println("Enter the String :");
sr=s.nextLine();
StringBuilder s1=new StringBuilder(sr);
rv=s1.reverse().toString();
if(sr.equals(rv))
{
System.out.println("Yes it is palindrome..");
}
else
{
System.out.println("No it is not palindrome....");
}
}
public static void main(String args[])
{
palindromeex p=new palindromeex();
p.pal();
}
}