import java.io.Console;
public class consoleex
{
public static void main(String args[])
{

Console c=System.console();
System.out.println("Enter Your Name :");
String n=c.readLine();
System.out.println("Welcome "+n);
System.out.println("Enter your password : ");
char ch[]=c.readPassword();   // use to invisible the password while typing..it.
String p=String.valueOf(ch);
System.out.println("Password : "+p);
}
}